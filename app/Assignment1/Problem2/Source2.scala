package Assignment2.Problem2

import scala.io.Source

object Source2 extends App {

  class Card(val value: Int, val suit: Int)

  type Hand = Array[Card]
  val CARDS_PER_HAND = 5
  val CARD_VALUES = 13

  val handle = Source.fromFile("poker.txt")

  val suits = Map('H' -> 0, 'S' -> 1, 'D' -> 2, 'C' -> 3)
  def values(c: Char) = {
    if (c.isDigit) c.asDigit else c match {
      case 'T' => 10; case 'J' => 11; case 'Q' => 12
      case 'K' => 13; case 'A' => 14
    }
  }

  sealed abstract class HandValue(val rank: Int, val values: List[Int]) extends Ordered[HandValue] {
    def compare (that: HandValue) = {
      if (this.rank != that.rank) this.rank - that.rank
      else (this.values zip that.values map { case (x, y) => x - y } find (_ != 0)).get
    }
  }

  case class HighCard(nums: List[Int]) extends HandValue(0, nums)
  case class OnePair(nums: List[Int]) extends HandValue(1, nums)
  case class TwoPair(nums: List[Int]) extends HandValue(2, nums)
  case class Trips(nums: List[Int]) extends HandValue(3, nums)
  case class Straight(nums: List[Int]) extends HandValue(4, nums)
  case class Flush(nums: List[Int]) extends HandValue(5, nums)
  case class FullHouse(nums: List[Int]) extends HandValue(6, nums)
  case class Quads(nums: List[Int]) extends HandValue(7, nums)
  case class StraightFlush(nums: List[Int]) extends HandValue(8, nums)

  val sessions = handle.getLines()
    .map(line => {
      line.split(" ").map(c =>
        new Card(values(c(0)), suits(c(1))) )
        .splitAt(CARDS_PER_HAND)
    })

  def handValue(h: Hand): HandValue  = {
    val groups = h groupBy (c => c.value)
    val suits: Int =  h.count(c => c.suit == h(0).suit)
    val counts: Iterable[Int] = groups.values.map(_.size)  // List of the card counts
    val (max, min) = (h.map(_.value).max[Int], h.map(_.value).min[Int])

    val keysWithCount: Int => Iterable[Int] =  {
      ct: Int => groups.keys.filter(groups(_).size == ct)
    }
    val isStraight: Boolean =
      (max - min == 4) || List('A', '2', '3', '4', '5').map(values).forall(h.contains)
    groups.size match {
      case 5 if isStraight && suits == 5 => StraightFlush(max :: Nil)
      case 5 if suits == 5 => Flush(max :: Nil)
      case 5 if isStraight => Straight(max :: Nil)
      case 5 => HighCard(max :: Nil)
      case 4 =>
        OnePair(keysWithCount(2).head :: keysWithCount(1).toList.sorted.reverse)
      case 3 if keysWithCount(3).isEmpty =>
        TwoPair(keysWithCount(2).max :: keysWithCount(2).min :: keysWithCount(1).head :: Nil)
      case 3 => Trips(keysWithCount(3).head :: Nil)
      case 2 if counts.head == 1 || counts.head == 4 =>
        Quads(keysWithCount(4).head :: Nil)
      case 2 if counts.head == 2 || counts.head == 3 =>
        FullHouse(keysWithCount(3).head :: Nil)
      case _ =>
        throw new RuntimeException("Should not have other groupings")
    }
  }

  val ans: Int = sessions count {
    hands => {
      handValue(hands._1) > handValue(hands._2)
    }
  }
  handle.close()
  println("Number of hands that Player 1 wins:  "+ans)
  val displayedAnswer = null
}

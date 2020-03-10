package Assignment1.Problem3

import scala.io.Source

case class Node(value:Int, var total: Int)

object Source3 {

  def main(args: Array[String]): Unit = {
    val tree = loadTriangle(Source.fromFile("triangle.txt").getLines)
    println(s"The maximum total from top to bottom in triangle.txt file with 100 rows is ${tree.last.map(i => i.total).max}")
  }

  def loadTriangle(lines: Iterator[String]) = {
    val triangle = lines.map(i => i.split(" ").map(j => Node(j.toInt, j.toInt))).toArray
    triangle.zipWithIndex.take(triangle.length-1).foreach(i => updateWeights(i._1, triangle(i._2 + 1)))
    triangle
  }

  def updateWeights(current: Array[Node], next: Array[Node]) = {
    current.zipWithIndex.foreach(i => {
      next(i._2).total = Math.max(next(i._2).total, next(i._2).value + i._1.total)
      next(i._2 + 1).total = Math.max(next(i._2 + 1).total, next(i._2 + 1).value + i._1.total)
    })
  }
}

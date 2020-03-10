package Assignment1.Problem1

import java.util._

object Source1  {

  def main(args: Array[String]): Unit = {
    numberOfSundays()
  }

  def numberOfSundays() = {
    val cal =  Calendar.getInstance()
    var result = 0
    cal.set(1901, Calendar.JANUARY, 1)

    while(cal.get(Calendar.YEAR) <= 2000)
    {
      if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
        result += 1
      cal.add(Calendar.MONTH,1)
    }
    result
  }
  assert(Source1.numberOfSundays() == 171)
  println("No. of Sundays fell on the 1st of month during the 20th century is "+numberOfSundays())
}



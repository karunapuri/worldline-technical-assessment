package Assignment2.helpers

import Assignment2.models.SquareWidget

case class SquareWidgetBuild(positionX: Int = 15, positionY: Int = 30, size: Int = 35){
  def build: SquareWidget = SquareWidget(positionX, positionY, size)
}

object SquareWidgetBuild {
  def defaultValuesBuild = SquareWidgetBuild().build
  println("Square " + defaultValuesBuild)
}

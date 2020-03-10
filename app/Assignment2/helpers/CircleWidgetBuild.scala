package Assignment2.helpers

import Assignment2.models.CircleWidget

case class CircleWidgetBuild(positionX: Int = 1, positionY: Int = 1, size: Int = 300){
  def build: CircleWidget = CircleWidget(positionX, positionY, size)
}
object CircleWidgetBuild {
  def defaultValuesBuild = CircleWidgetBuild().build
  println("Circle " + defaultValuesBuild)
}

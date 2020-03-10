package Assignment2.helpers

import Assignment2.models.EllipseWidget

case class EllipseWidgetBuild(positionX: Int = 100, positionY: Int = 150, diameterH: Int = 300, diameterV: Int = 200){
  def build: EllipseWidget = EllipseWidget(positionX, positionY, diameterH, diameterV)
}

object EllipseWidgetBuild {
  def defaultValuesBuild = EllipseWidgetBuild().build
  println("Ellipse " + defaultValuesBuild)
}

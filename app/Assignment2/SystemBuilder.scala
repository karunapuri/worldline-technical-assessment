package Assignment2

import Assignment2.helpers._

object SystemBuilder {
  def main(args: Array[String]) = {
    println("----------------------------------------------------------------")
    println("Bill of Materials")
    println("----------------------------------------------------------------")

    //Builder pattern using Abstract Class
    val rectangleWidgetBuild = new RectangleWidgetBuild().withPositionX(10).withPositionY(10).withWidth(30).withHeight(40)
    val rectangleWidget = rectangleWidgetBuild.build
    println("Rectangle " + rectangleWidget)

    //Builder pattern using Scala case class
    SquareWidgetBuild.defaultValuesBuild
    EllipseWidgetBuild.defaultValuesBuild
    CircleWidgetBuild.defaultValuesBuild
    TextBoxWidgetBuild.defaultValuesBuild

    println("----------------------------------------------------------------")
  }
}

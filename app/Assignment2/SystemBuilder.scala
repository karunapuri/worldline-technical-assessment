package Assignment2

import Assignment2.helpers._

object SystemBuilder {
  def main(args: Array[String]) = {
    println("----------------------------------------------------------------")
    println("Bill of Materials")
    println("----------------------------------------------------------------")

    val rectangleWidgetBuild = new RectangleWidgetBuild().withPositionX(10).withPositionY(10).withWidth(30).withHeight(40)
    val rectangleWidget = rectangleWidgetBuild.build
    println("Rectangle " + rectangleWidget)

    val squareWidgetBuild = new SquareWidgetBuild().withPositionX(15).withPositionY(30).withSize(35)
    val squareWidget = squareWidgetBuild.build
    println("Square " + squareWidget)

    EllipseWidgetBuild.defaultValuesBuild
    CircleWidgetBuild.defaultValuesBuild
    TextBoxWidgetBuild.defaultValuesBuild

    println("----------------------------------------------------------------")
  }
}

//+++++Abort+++++”

/*
object System {
  def main(args: Array[String]) = {
    println("----------------------------------------------------------------")
    println("Bill of Materials")
    println("----------------------------------------------------------------")

    def build(system: System) =
      system match {
        case EllipseWidget() => EllipseWidgetBuild.defaultValuesBuild
        case  _ => ""
      }
    println("----------------------------------------------------------------")
  }
}*/

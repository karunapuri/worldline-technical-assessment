package Assignment2

import Assignment2.helpers._
import Assignment2.models._

case class Widget(isRectangleWidgetBuild: Unit,
                  isSquareWidget:SquareWidget,
                  isEllipseWidget:EllipseWidget,
                  isCircleWidget: CircleWidget,
                  isTextBoxWidget: TextBoxWidget)

object SystemBuilder extends  App{
    println("----------------------------------------------------------------")
    println("Bill of Materials")
    println("----------------------------------------------------------------")

  /*
   * Rectangle Widget Builder Pattern is designed using Abstract Class
   * (which is similar to other programming languages like Java)
   * and rest all widgets (like Square, Circle, Ellipse, and TextBox)
   * are designed using Scala case class concept. Reason for doing so is
   * to demonstrate possible designs for designing Builder Design Pattern in Scala
   */

    val rectangleWidgetBuild = new RectangleWidgetBuild().withPositionX(10).withPositionY(10).withWidth(30).withHeight(40)
    val rectangleWidget = rectangleWidgetBuild.build
    val rectangleWidgetFormat = println("Rectangle " + rectangleWidget)

    Widget match {

        case _: Widget.type =>
          Widget(
          isRectangleWidgetBuild = rectangleWidgetFormat,
          isSquareWidget = SquareWidgetBuild.defaultValuesBuild,
          isEllipseWidget = EllipseWidgetBuild.defaultValuesBuild,
          isCircleWidget = CircleWidgetBuild.defaultValuesBuild,
          isTextBoxWidget = TextBoxWidgetBuild.defaultValuesBuild
          )
        case _ => println ("+++++Abort+++++")
      }

    println("----------------------------------------------------------------")
  }

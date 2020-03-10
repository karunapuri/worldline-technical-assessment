package Assignment2

abstract class System

abstract class SquareWidgetBuilder {
  var positionX: Int
  var positionY: Int
  var size: Int

  def withPositionX(positionX: Int): SquareWidgetBuilder
  def withPositionY(positionY: Int): SquareWidgetBuilder
  def withSize(size: Int): SquareWidgetBuilder

  def build: System
}
class SquareWidget(builder: SquareWidgetBuilder) extends System {
  val positionX: Int = builder.positionX
  val positionY: Int = builder.positionY
  val size: Int = builder.size

  override def toString: String = {
    "(" + positionX + "," + positionY + ") " + "size=" + size
  }
}
class SquareWidgetBuild extends SquareWidgetBuilder {
  var positionX: Int = 0
  var positionY: Int = 0
  var size: Int = 0

  override def withPositionX(positionX: Int): SquareWidgetBuilder = {
    this.positionX = positionX
    this
  }

  override def withPositionY(positionY: Int): SquareWidgetBuilder = {
    this.positionY = positionY
    this
  }

  override def withSize(size: Int): SquareWidgetBuilder = {
    this.size = size
    this
  }

  override def build: System = new SquareWidget(this)
}

abstract class RectangleWidgetBuilder {
    var positionX: Int
    var positionY: Int
    var width: Int
    var height: Int

    def withPositionX(positionX: Int): RectangleWidgetBuilder
    def withPositionY(positionY: Int): RectangleWidgetBuilder
    def withWidth(width: Int): RectangleWidgetBuilder
    def withHeight(height: Int): RectangleWidgetBuilder

    def build: System
  }
class RectangleWidget(builder: RectangleWidgetBuilder) extends System {
  val positionX: Int = builder.positionX
  val positionY: Int = builder.positionY
  val width: Int = builder.width
  val height: Int = builder.height

  override def toString: String = {
    "(" + positionX + "," + positionY + ") " + "width=" + width + " height=" + height
  }
}
class RectangleWidgetBuild extends RectangleWidgetBuilder {
  var positionX: Int = 0
  var positionY: Int = 0
  var width: Int = 0
   var height: Int = 0

  override def withPositionX(positionX: Int): RectangleWidgetBuilder = {
    this.positionX = positionX
    this
  }

  override def withPositionY(positionY: Int): RectangleWidgetBuilder = {
    this.positionY = positionY
    this
  }

  override def withWidth(width: Int): RectangleWidgetBuilder = {
    this.width = width
    this
  }

  override def withHeight(height: Int): RectangleWidgetBuilder = {
    this.height = height
    this
  }

  override def build: System = new RectangleWidget(this)
}

case class EllipseWidget(positionX: Int, positionY: Int, diameterH: Int, diameterV: Int){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " diameterH = " + diameterH + " diameterV = " + diameterV
  }
}
case class EllipseWidgetBuild(positionX: Int = 100, positionY: Int = 150, diameterH: Int = 300, diameterV: Int = 200){
  def build: EllipseWidget = EllipseWidget(positionX, positionY, diameterH, diameterV)
}
object EllipseWidgetBuild {
  def defaultValuesBuild = EllipseWidgetBuild().build
  println("Ellipse " + defaultValuesBuild)
}

case class CircleWidget(positionX: Int, positionY: Int, size: Int){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " size=" + size
  }
}
case class CircleWidgetBuild(positionX: Int = 1, positionY: Int = 1, size: Int = 300){
  def build: CircleWidget = CircleWidget(positionX, positionY, size)
}
object CircleWidgetBuild {
  def defaultValuesBuild = CircleWidgetBuild().build
  println("Circle " + defaultValuesBuild)
}

case class TextBoxWidget(positionX: Int, positionY: Int, width: Int, height: Int, text: String){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " width=" + width + " height="+ height + " text=" + text
  }
}
case class TextBoxWidgetBuild(positionX: Int = 5, positionY: Int = 5, width: Int = 200, height: Int = 100, text: String = "sample text"){
  def build: TextBoxWidget = TextBoxWidget(positionX, positionY, width, height, text)
}
object TextBoxWidgetBuild {
  def defaultValuesBuild = TextBoxWidgetBuild().build
  println("TextBox " + defaultValuesBuild)
}

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

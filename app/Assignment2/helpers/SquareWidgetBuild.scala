package Assignment2.helpers

import Assignment2.System
import Assignment2.models.SquareWidget

abstract class SquareWidgetBuilder {
  var positionX: Int
  var positionY: Int
  var size: Int

  def withPositionX(positionX: Int): SquareWidgetBuilder
  def withPositionY(positionY: Int): SquareWidgetBuilder
  def withSize(size: Int): SquareWidgetBuilder

  def build: System
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

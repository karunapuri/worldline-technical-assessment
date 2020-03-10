package Assignment2.helpers

import Assignment2.System
import Assignment2.models.RectangleWidget

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

package Assignment2.models

import Assignment2.System
import Assignment2.helpers.RectangleWidgetBuilder

class RectangleWidget(builder: RectangleWidgetBuilder) extends System {
  val positionX: Int = builder.positionX
  val positionY: Int = builder.positionY
  val width: Int = builder.width
  val height: Int = builder.height

  override def toString: String = {
    "(" + positionX + "," + positionY + ") " + "width=" + width + " height=" + height
  }
}

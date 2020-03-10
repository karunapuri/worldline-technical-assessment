package Assignment2.models

import Assignment2.System
import Assignment2.helpers.SquareWidgetBuilder

class SquareWidget(builder: SquareWidgetBuilder) extends System {
  val positionX: Int = builder.positionX
  val positionY: Int = builder.positionY
  val size: Int = builder.size

  override def toString: String = {
    "(" + positionX + "," + positionY + ") " + "size=" + size
  }
}

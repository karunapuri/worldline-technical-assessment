package Assignment2.models

case class CircleWidget(positionX: Int, positionY: Int, size: Int){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " size=" + size
  }
}

package Assignment2.models

case class SquareWidget(positionX: Int, positionY: Int, size: Int){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " size=" + size
  }
}
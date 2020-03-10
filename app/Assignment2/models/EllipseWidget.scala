package Assignment2.models

case class EllipseWidget(positionX: Int, positionY: Int, diameterH: Int, diameterV: Int){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " diameterH = " + diameterH + " diameterV = " + diameterV
  }
}

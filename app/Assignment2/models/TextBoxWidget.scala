package Assignment2.models

case class TextBoxWidget(positionX: Int, positionY: Int, width: Int, height: Int, text: String){
  override def toString: String = {
    "(" + positionX + "," + positionY + ")" + " width=" + width + " height="+ height + " text=" + text
  }
}

package Assignment2.helpers

import Assignment2.models.TextBoxWidget

case class TextBoxWidgetBuild(positionX: Int = 5, positionY: Int = 5, width: Int = 200, height: Int = 100, text: String =
"sample text"){
  def build: TextBoxWidget = TextBoxWidget(positionX, positionY, width, height, text)
}

object TextBoxWidgetBuild {
  def defaultValuesBuild = TextBoxWidgetBuild().build
  println("TextBox " + defaultValuesBuild)
}
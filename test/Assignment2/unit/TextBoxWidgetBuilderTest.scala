package Assignment2.unit

import Assignment2.helpers.TextBoxWidgetBuild
import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class TextBoxWidgetBuilderTest extends FunSpec with Matchers{

  describe("Textbox Widget") {
    val expectedSysOutput = TextBoxWidgetBuild.defaultValuesBuild

    it("should build textbox Widget with coordinates") {
      Assert.assertEquals(5, expectedSysOutput.positionX)
      Assert.assertEquals(5, expectedSysOutput.positionY)
      Assert.assertEquals("sample text", expectedSysOutput.text)
    }

    it("should print textbox widget in 'Bill of Materials' in format") {
      val expectedPrintFormat = "TextBox " + expectedSysOutput
      expectedPrintFormat should be ("TextBox (5,5) width=200 height=100 text=sample text")
    }
  }
}

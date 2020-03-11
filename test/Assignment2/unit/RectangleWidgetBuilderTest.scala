package Assignment2.unit

import Assignment2.helpers.RectangleWidgetBuild
import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class RectangleWidgetBuilderTest extends FunSpec with Matchers{

  describe("Rectangle Widget") {

    val expectedSysOutput = new RectangleWidgetBuild().withPositionX(10).withPositionY(10).withWidth(30).withHeight(40)
    it("should build rectangle Widget with coordinates") {
      Assert.assertEquals(10, expectedSysOutput.positionX)
      Assert.assertEquals(10, expectedSysOutput.positionY)
      Assert.assertEquals(30, expectedSysOutput.width)
      Assert.assertEquals(40, expectedSysOutput.height)
    }

    it("should print rectangle widget in 'Bill of Materials' in format") {
      val expectedPrintFormat = "Rectangle " + expectedSysOutput.build
      expectedPrintFormat should be ("Rectangle (10,10) width=30 height=40")
    }
  }
}

package Assignment2.unit

import Assignment2.helpers.SquareWidgetBuild
import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class SquareWidgetBuilderTest extends FunSpec with Matchers{

  describe("Square Widget") {

    val expectedSysOutput = SquareWidgetBuild.defaultValuesBuild

    it("should build square Widget with coordinates") {
      Assert.assertEquals(15, expectedSysOutput.positionX)
      Assert.assertEquals(30, expectedSysOutput.positionY)
      Assert.assertEquals(35, expectedSysOutput.size)
    }

    it("should print Square widget in 'Bill of Materials' in format") {
      val expectedPrintFormat = "Square " + expectedSysOutput
      expectedPrintFormat should be ("Square (15,30) size=35")
    }
  }
}

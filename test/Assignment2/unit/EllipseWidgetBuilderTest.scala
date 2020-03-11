package Assignment2.unit

import Assignment2.helpers.EllipseWidgetBuild
import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class EllipseWidgetBuilderTest extends FunSpec with Matchers{

  describe("Ellipse Widget") {
    val expectedSysOutput = EllipseWidgetBuild.defaultValuesBuild

    it("should build ellipse Widget with coordinates") {
      Assert.assertEquals(100, expectedSysOutput.positionX)
      Assert.assertEquals(150, expectedSysOutput.positionY)
      Assert.assertEquals(300, expectedSysOutput.diameterH)
      Assert.assertEquals(200, expectedSysOutput.diameterV)
    }

    it("should print ellipse widget in 'Bill of Materials' in format") {
      val expectedPrintFormat = "Ellipse " + expectedSysOutput
      expectedPrintFormat should be ("Ellipse (100,150) diameterH = 300 diameterV = 200")
    }
  }
}

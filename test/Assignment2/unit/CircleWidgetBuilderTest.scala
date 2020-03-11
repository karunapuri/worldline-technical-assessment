package Assignment2.unit

import Assignment2.helpers.CircleWidgetBuild
import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class CircleWidgetBuilderTest extends FunSpec with Matchers{

  describe("Circle Widget") {
    val expectedSysOutput = CircleWidgetBuild.defaultValuesBuild

    it("should build circle Widget with coordinates"){
      Assert.assertEquals(1, expectedSysOutput.positionX)
      Assert.assertEquals(1, expectedSysOutput.positionY)
      Assert.assertEquals(300, expectedSysOutput.size)
    }

    it("should print circe widget in 'Bill of Materials' in format") {
      val expectedPrintFormat = "Circle " + expectedSysOutput
      expectedPrintFormat should be ("Circle (1,1) size=300")
    }
  }
}

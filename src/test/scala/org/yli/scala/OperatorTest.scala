package org.yli.scala

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by yli on 10/14/15.
 */
class OperatorTest extends FlatSpec with Matchers {

  "Operator Add" should "add two integer together" in {
    Operator.add(1, 2) should be (3)
  }

  it should "add two zero" in {
    Operator.add(0, 0) should be (0)
  }

}

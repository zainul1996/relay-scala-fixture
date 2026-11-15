package com.example

class MathSuite extends munit.FunSuite {
  test("add adds two numbers") {
    assertEquals(Math.add(2, 3), 5)
  }

  test("fibonacci(0) is 0") {
    assertEquals(Math.fibonacci(0), BigInt(0))
  }

  test("fibonacci(1) is 1") {
    assertEquals(Math.fibonacci(1), BigInt(1))
  }

  test("fibonacci(10) is 55") {
    assertEquals(Math.fibonacci(10), BigInt(55))
  }

  test("fibonacci throws for negative input") {
    intercept[IllegalArgumentException](Math.fibonacci(-1))
  }
}

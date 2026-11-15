package com.example

class MathSuite extends munit.FunSuite {
  test("add adds two numbers") {
    assertEquals(Math.add(2, 3), 5)
  }
}

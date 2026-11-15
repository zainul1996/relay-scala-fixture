package com.example

object Math {
  def add(left: Int, right: Int): Int = left + right

  def fibonacci(n: Int): BigInt = {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative")
    var a = BigInt(0)
    var b = BigInt(1)
    var i = 0
    while (i < n) {
      val next = a + b
      a = b
      b = next
      i += 1
    }
    a
  }
}

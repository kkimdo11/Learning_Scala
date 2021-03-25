object chap2 {

  def main(args: Array[String]): Unit = {

    println("---")
    var x: Int = 5
    println(x)
    println(x * 2)
    println(x / 5)

    println("---")
    var a: Double = 2.72
    println(a)
    a = 355.0 / 113.0
    println(a)
    a = 5
    println(a)

    println("---")
    val x1: Int = 20
    println(x1)
    val greeting: String = "Hello, World"
    println(greeting)
    val atSymbol: Char = '@'
    println(atSymbol)

    //val x: Int = "Hello"

    println("---")
    var x2 = 5
    println(x2)
    x2 = x2 * 4
    println(x2)
    var y = 1.5
    println(y)
    y = 42
    println(y)

    println("---")
    val π = 3.14159
    println(π)
    val $ = "USD currency symbol"
    println($)
    val o_O = "Hmm"
    println(o_O)
    val `a.b` = 4

    println("---")
    val b: Byte = 10
    println(b)
    val s: Short = b
    println(s)
    val d: Double = s
    println(d)

    println("---")
    val l: Long = 20
    println(l)
    val i: Int = l.toInt
    println(i)

    println("---")
    val anInt = 5
    println(anInt)
    val yellowRgb = 0xffff00
    println(yellowRgb)
    val id = 100l
    println(id)
    val pi = 3.1416
    println(pi)

    println("---")
    val hello = "Hello There"
    println(hello)
    val signature = "With Regards, \nYour friend"
    println(signature)
    val greeting2 = "Hello, " + "World"
    println(greeting2)
    val matched = (greeting == "Hello, World")
    println(matched)
    val theme = "Na " * 16 + "Batman!"
    println(theme)

    println("---")
    val approx = 355 / 113f
    println(approx)
    println("Pi, using 355/113, is about " + approx + ".")
    println(s"Pi, using 355/113, is about $approx.")
    val item = "apple"
    println(s"How do you like them ${item}s?")
    println(s"Fish n chips n vinegar, ${"pepper " * 3}salt")

    println(f"I wrote a new $item%.3s today")
    println(f"Enjoying this $item ${355 / 113.0}%.5f times today")

    println("---")
    val c = 'A'
    println(c)
    val i2: Int = c
    println(i2)
    val t: Char = 116
    println(t)

    println("---")
    val isTrue = !true
    println(isTrue)
    val isFalse = !true
    println(isFalse)
    val unequal = (5 != 6)
    println(unequal)
    val isLess = (5 < 6)
    println(isLess)
    val unequalAndLess = unequal & isLess
    println(unequalAndLess)
    val definitelyFalse = false && unequal
    println(definitelyFalse)

    println("---")
    val zero = 0
    val isValid = zero > 0
    println(isValid)

    println("---")
    val info = (5, "Korben", true)
    println(info)
    val name = info._2
    println(name)
    val red = "red" -> "0xff0000"
    println(red)
    val reversed = red._2 -> red._1
    println(reversed)

  }
}

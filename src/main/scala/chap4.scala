object chap4 {

  def hi = "hi"

  def multiplier(x: Int, y: Int): Int = {
    x * y
  }

  def safeTrim(s: String): String = {
    if (s == null) return null
    s.trim()
  }

  def log(d: Double) = println(f"Got value $d%.2f")

  def hi2(): String = "hi"

  def formatEuro(amt: Double) = f"€$amt%.2f"

  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n - 1)
    else 1
  }

  @annotation.tailrec
  def power2(x: Int, n: Int, t: Int = 1): Int = {
    if (n < 1) t
    else power2(x, n - 1, x * t)
  }

  def max(a: Int, b: Int, c: Int) = {
    def max(x: Int, y: Int) = if (x > y) x else y

    max(a, max(b, c))
  }

  def greet(prefix: String, name: String) = s"$prefix $name"

  def greet2(prefix: String = "", name: String) = s"$prefix$name"

  def greet3(name: String, prefix: String = "ms ") = s"$prefix$name"

  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }

  def max2(x: Int)(y: Int) = if (x > y) x else y

  def identity[A](a: A): A = a



  def main(args: Array[String]): Unit = {
    println(hi)
    println(multiplier(6, 7))
    println(safeTrim(" xx "))
    println(log(2.23535))
    println(hi2())
    println(formatEuro {
      val rate = 1.32;
      0.235 + 0.7123 + rate * 5.32
    })
    println(power(2, 8))
    println(power2(2, 8))
    println(max(42, 181, 19))

    val greeting1 = greet(name = "Brown", prefix = "Mr")
    println(greeting1)

    val greeting2 = greet2(name = "Paul")
    println(greeting2)

    val greeting3 = greet3("Ola")
    println(greeting3)

    println(sum(10, 20, 30))

    val larger = max2(20)(39)
    println(larger)

    val s: String = identity[String]("Hello")
    val d: Double = identity[Double](2.717)
    println(s)
    println(d)


    val s2 = "vacation.jpg"
    val isJPEG = s2.endsWith(".jpg")
    println(isJPEG)


  }


}

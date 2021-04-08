object chap5 {

  def double(x: Int): Int = x * 2

  def max(a: Int, b: Int) = if (a > b) a else b

  def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50

  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }

  def reverser(s: String) = s.reverse

  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

  def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a, b, c)

  def factorOf(x: Int, y: Int) = y % x == 0

  def factorOf2(x: Int)(y: Int) = y % x == 0

  def doubles(x: => Int) = {
    println("Now doubling " + x)
    x * 2
  }

  def f1(i: Int) = { println(s"Hello from f($i)"); i }

  def main(args: Array[String]): Unit = {

    println(double(2))
    val myDouble: (Int) => Int = double
    println(myDouble(5))

    val myDoubleCopy = myDouble
    println(myDoubleCopy(5))


    val maximize: (Int, Int) => Int = max
    println(maximize(50, 30))

    //val start: () => String = logStart

    //println(start())

    println(safeStringOp(null, reverser))
    println(safeStringOp("Ready", reverser))

    //val maximize2: (Int, Int) => Int = max
    val maximize2 = (a: Int, b: Int) => if (a > b) a else b

    println(maximize2(84, 96))

    println(safeStringOp(null, (s: String) => s.reverse))
    println(safeStringOp("Ready", (s: String) => s.reverse))

    println(safeStringOp("Ready", _.reverse))


    println(combination(23, 12, _ * _))

    println(tripleOp(23, 92, 14, _ * _ + _))

    val f = factorOf _
    val x = f(7, 20)
    println(x)

    val multipleOf3 = factorOf(3, _: Int)
    println(multipleOf3(78))

    val isEven = factorOf2(2) _
    val z = isEven(32)

    println(z)


    println( doubles(5))

    println( doubles( f1(8) ))
  }
}

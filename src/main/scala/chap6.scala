
object chap6 {

  def main(args: Array[String]): Unit = {
    val numbers = List(32, 95, 24, 21, 17)

    val colors = List("red", "green", "blue")

    println(colors.head)
    println(colors.tail)
    println(colors(1))
    println(colors(2))

    var total = 0;
    for (i <- numbers) {
      total += i
    }

    println(total)

    for (c <- colors) {
      println(c)
    }
    colors.foreach((c: String) => println(c))

    val sizes = colors.map((c: String) => c.size)
    println(sizes)
    val total2 = numbers.reduce((a: Int, b: Int) => a + b)
    println(total2)

    val unique = Set(10, 20, 30, 20, 20, 10)
    println(unique)
    val sum = unique.reduce((a: Int, b: Int) => a + b)
    println(sum)

    val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00,
      "blue" -> 0xFF)
    println(colorMap)

    val redRGB = colorMap("red")
    println(redRGB)

    val cyanRGB = colorMap("green") | colorMap("blue")
    println(cyanRGB)
    val hasWhite = colorMap.contains("white")
    println(hasWhite)
    for (pairs <- colorMap) {
      println(pairs)
    }

    val oddsAndEvents = List(List(1, 3, 5), List(2, 4, 6))
    println(oddsAndEvents)
    val keyValues = List(('A', 65), ('B', 66), ('C', 67))
    println(keyValues)

    val primes = List(2, 3, 5, 7, 11, 13)
    var i = primes
    while ( {
      !i.isEmpty
    }) {
      print(i.head + ", ")
      i = i.tail
    }

    def visit(i: List[Int]) {
      if (i.size > 0) {
        print(i.head + ", ");
        visit(i.tail)
      }
    }

    visit(primes)

    println()

    var i2 = primes
    while (i2 != Nil) {
      print(i2.head + ", ");
      i2 = i2.tail
    }
    println()

    val l: List[Int] = List()
    println(l == Nil)


    val m: List[String] = List("a")

    println(m.head)
    println(m.tail == Nil)

    val numbers2 = 1 :: 2 :: 3 :: Nil
    println(numbers2)

    val first2 = Nil.::(1)
    println(first2.tail == Nil)

    val second2 = 2 :: first2
    println(second2)
    println(second2.tail == first2)


    val f = List(23, 8, 14, 21) filter (_ > 18)
    println(f)

    val p = List(1, 2, 3, 4, 5) partition (_ < 3)
    println(p)

    val s2 = List("apple", "to") sortBy (_.size)
    println(s2)

    val appended = List(1, 2, 3, 4) :+ 5
    println(appended)

    val suffix = appended takeRight 3
    println(suffix)

    val middle = suffix dropRight 2
    println(middle)

    val collect = List(0, 1, 0) collect { case 1 => "ok" }
    println(collect)

    val flatMap = List("milk,tea") flatMap (_.split(','))
    println(flatMap)


    val validations = List(true, true, false, true, true, true)
    println(validations)
    val valid1 = !(validations contains false)
    println(valid1)
    val valid2 = validations forall (_ == true)
    println(valid2)
    val valid3 = validations.exists(_ == false) == false
    println(valid3)

    def contains(x: Int, l: List[Int]): Boolean = {
      var a: Boolean = false
      for (i <- l) {
        if (!a) a = (i == x)
      }
      a
    }

    val included = contains(19, List(46, 19, 92))
    println(included)


    def boolReduce(l: List[Int], start: Boolean)(f: (Boolean, Int) => Boolean): Boolean = {
      var a = start
      for (i <- l) a = f(a, i)
      a
    }

    val included2 = boolReduce(List(46, 19, 92), false) {
      (a, i) => if (a) a else (i == 19)
    }

    println(included2)


    def reduceOp[A, B](l: List[A], start: B)(f: (B, A) => B): B = {
      var a = start
      for (i <- l) a = f(a, i)
      a
    }

    val included3 = reduceOp(List(46, 19, 92), false) {
      (a, i) => if (a) a else (i == 19)
    }

    println(included3)

    val answer = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)
    println(answer)

    val included4 = List(46, 19, 92).foldLeft(false) {
      (a, i) => if (a) a else (i == 19)
    }
    println(included4)

    val answer2 = List(11.3, 23.5, 7.2).reduceLeft(_ + _)
    println(answer2)


    import collection.JavaConverters._

    List(12, 29).asJava

    val statuses = List(500, 404)
    val msg = statuses.head match {
      case x if x < 500 => "okay"
      case _ => "whoah, an error"
    }
    println(msg)

    val msg2 = statuses match {
      case x if x contains (500) => "has error"
      case _ => "okay"
    }
    println(msg2)

    val msg3 = statuses match {
      case List(404, 500) => "not found & error"
      case List(500, 404) => "error & not found"
      case List(200, 200) => "okay"
      case _ => "not sure what happened"
    }
    println(msg3)

  }
}

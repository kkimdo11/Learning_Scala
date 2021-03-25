object chap3 {

  def main(args: Array[String]): Unit = {

    val x = 5 * 20
    val amount = x + 10
    println(x + ", " + amount)
    val amount1 = {
      val x = 5 * 20
      x + 10
    }
    println(amount1)

    val a = 1
    val b = a * 2
    val c = b + 4
    println(a + ", " + b + ", " + c)
    println("---")

    if (47 % 3 > 0) println("Not a multiple of 3")
    val result = if (false) "what does this return?"

    println("---")
    val x1 = 10
    val y1 = 20
    val max1 = if (x1 > y1) println(x1) else println(y1)

    val x2 = 10
    val y2 = 20
    val max2 = x2 > y2 match {
      case true => x2
      case false => y2
    }
    println(max2)


    println("---")

    val status = 500
    val message = status match {
      case 200 =>
        "ok"
      case 400 => {
        println("ERROR - we called the service incorrectly")
        "error"
      }
      case 500 => {
        println("ERROR - the service encountered an error")
        "error"
      }
    }

    val day = "MON"
    val kind = day match {
      case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
        "weekday"
      case "SAT" | "SUN" =>
        "weekend"
    }
    println(kind)

    val message2 = "Ok"
    val status2 = message2 match {
      case "Ok" => 200
      case other => {
        println(s"Couldn't parse $other")
        -1
      }
    }
    println(status2)

    val message3 = "Unauthorized"
    val status3 = message3 match {
      case "Ok" => 200
      case _ => {
        println(s"Couldn't parse $message")
        -1
      }
    }
    println(status3)

    println("---")
    for (x <- 1 to 7) {
      println(s"Day $x:")
    }
    val vec = for (x <- 1 to 7) yield {
      s"Day $x:"
    }
    println(vec)
    for (day <- vec) print(day + ", ")
    println()


    println("---")
    val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
    println(threes)

    val quote = "Faith,Hope,,Charity"
    for {
      t <- quote.split(",")
      if t != null
      if t.size > 0
    } {
      println(t)
    }

    println("---")
    for {x <- 1 to 2
         y <- 1 to 3} {
      print(s"($x,$y) ")
    }

    println("---")
    val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
    println(powersOf2)

    println("---")
    var x3 = 10
    while (x3 > 0) x3 -= 1
    println(x3)

    val x4 = 0
    do println(s"Here I am, x = $x4") while (x4 > 0)


  }

}

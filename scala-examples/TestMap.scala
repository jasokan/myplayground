

import java.util.Calendar

object TestMap {
  def main(args: Array[String]) {

    var names: Map[Int, String] = Map()

    val startTime = Calendar.getInstance().getTime()

    for (i <- 1 to 200000) {
      names += (i -> ("Jagan" + i.toString()));

    }
    names.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + names(i))
    }
    
    val endTime = Calendar.getInstance().getTime()
    
    println(startTime)
    println(endTime)

  }
}


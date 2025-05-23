package Function_Programming

object DemoIFunctionCallByName {

 /* def main(args: Array[String]): Unit = {
    printIncrementValue(2)
  }

  def printIncrementValue(x:Int) ={
    println("Addition value is "+ Increment(x))
  }

  def Increment(y: Int) ={
    println("value of y is "+ y)
    var z = y+1
    println("value of y after increment is "+ z)
    z
  }
  */

  def main(args: Array[String]): Unit = {
    printIncrementValue(Increment())
    printIncrementValue(Decrement())
  }

  def printIncrementValue(m:Int) ={
    println("value is "+ m)
  }

  def Increment( ) ={
    var y =2
    println("value of y is "+ y)
    var z = y+1
    println("value of y after increment is "+ z)
    z
  }

  def Decrement( ) ={
    var y =2
    println("value of y is "+ y)
    var z = y-1
    println("value of y after decrement is "+ z)
    z
  }


}

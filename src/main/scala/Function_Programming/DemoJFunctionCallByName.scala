package Function_Programming

object DemoJFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printIncrementValue(Increment,2)
    printIncrementValue(Decrement,2)
  }

  def printIncrementValue(m: (Int)=> Int, x:Int) ={
    println("value is "+ m(x))
  }

  def Increment(y:Int) ={
    println("value of y is "+ y)
    var z = y+1
    println("value of y after increment is "+ z)
    z
  }

  def Decrement(y:Int) ={
    println("value of y is "+ y)
    var z = y-1
    println("value of y after decrement is "+ z)
    z
  }
}

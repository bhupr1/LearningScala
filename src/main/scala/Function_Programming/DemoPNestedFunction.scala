package Function_Programming

object DemoPNestedFunction {
  def main(args: Array[String]): Unit = {
    /* def printHello(msg:String)={
      println("Hello " +msg)
    } */
    val printHello = (msg:String) => println("Hello " +msg)
    printHello("World")
    printHello("India")
  }

}

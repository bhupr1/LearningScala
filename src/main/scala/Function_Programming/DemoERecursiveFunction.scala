package Function_Programming

object DemoERecursiveFunction {

  def factorial(x:Int):Int = {
    if(x <= 1)
        1
      else
        x * factorial(x-1) //Recursive Function : call itself
    }

    def main(args: Array[String]): Unit = {
      var fact = factorial(5)
      println(fact)
    }
}

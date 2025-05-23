package Function_Programming

object DemoAFunction {
  def sum(x:Int,y:Int):Int = {
    return (x + y)
    }

    def main(args: Array[String]): Unit = {
      var Z: Int = sum(10, 20)
      println(Z)
    }
  }

// function with named Arguments
package Function_Programming

object DemoBFunctionWithNamedArgument {

  def sum(x:Int,y:Int):Int = {
    println("value of x is "+ x)
    println("value of y is "+ y)
    return (x + y) }
  def main(args: Array[String]): Unit = {
    var z = sum(y=2,x=3)
    println("The Sum of two numbers are " + z)

  }

}

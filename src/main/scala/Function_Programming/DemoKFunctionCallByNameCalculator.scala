package Function_Programming

object DemoKFunctionCallByNameCalculator {
  def main(args: Array[String]): Unit = {
    println("Addition of two Numbers "+calculator(add,5,2))
    println("Substraction of two Numbers "+calculator(sub,5,2))
    println("Multiplication of two Numbers "+calculator(mul,5,2))
    println("Quotient of division of two Numbers "+calculator(div,5,2))
    println("Remainder of divison of two Numbers "+calculator(rem,5,2))
  }

  def calculator(m: (Int,Int)=> Int, x:Int, y:Int) ={
   m(x,y)
  }
 // def add(x:Int, y:Int) = {x + y}
  var add = (x:Int, y:Int) => x + y
  var sub = (x:Int, y:Int) => x - y
  var mul = (x:Int, y:Int) => x * y
  var div = (x:Int, y:Int) => x / y
  var rem = (x:Int, y:Int) => x % y
}

package Function_Programming

object DemoTCarryingFunctionWithPartialApplied {

  //Curring function declaration
  def add2(a:Int)(b:Int):Int = a + b

  def main(args: Array[String]): Unit = {
  val sum = add2(29)_  //Partially Applied function
    println(sum(5))
  }
}
// Function Chaining ( result you get is chain of functions)
// = Function Currying (Separate parameter in different Brackets) +
// Partially Applied Function (i.e use _)
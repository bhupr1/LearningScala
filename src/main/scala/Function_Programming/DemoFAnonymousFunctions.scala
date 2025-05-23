//Anonymous Functions : Function without a name and def keyword.
//First Class Function ...pass function as parameter and define function values
package Function_Programming

object DemoFAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    println("Increment Function output is "+ Increments(5))
    printHelloWorld()
    println("add Function output is "+ add(30,3))
  }
   // Example 1 : Anonymous Functions with 1 input parameter and 1 output parameter
   //Normal Way of defining an increments Functions
   //def Increments(i: Int):Int = {
   //   i+1
    //}

 // var x:Int =5
  //Using Function value / Anonymous Function
  var Increments = (x:Int) => x + 1
 // var Increments = (x:Int) => {println("value of x is "+ x ); x + 1}


  // Example 2 : Anonymous Functions with 0 input parameter and 0 output parameter
  // Normal way of defining functions

 // def printHelloWorld() = {
  //  println("Hello World")
 // }
  //Using Function value / Anonymous Function
  var printHelloWorld = () => println("Hello World")



  // Example 3: Anonymous Functions with 2 input parameter and 1 output parameter
  // Normal way of defining functions

  //def add(x:Int, y:Int):Int = {
   // x + y
  //}
  //Using Function value / Anonymous Function
  var add = (x:Int,y:Int) => x + y
}

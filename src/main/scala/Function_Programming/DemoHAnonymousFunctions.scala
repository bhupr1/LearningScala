package Function_Programming
object DemoHAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    var ListOfNumbers = List(0,1,2,3,4,5,6,7,8,9,10)
    // Use With Map
    var squareOfNumbers =ListOfNumbers.map(square)
    println(squareOfNumbers)

   // var squareOfNumbersAA =ListOfNumbers.map( (x:Int) => x * x)
   var squareOfNumbersAA =ListOfNumbers.map( x => x * x)
   //var squareOfNumbersAA =ListOfNumbers.map( _ * _ )
    //Note : This will not work because TWO "_"  expects two input however map Only provides 1 input i.e map provides one number at a given time
    println(squareOfNumbersAA)

   // var doubleOfNumbers =ListOfNumbers.map( (x:Int) => x * 2)
    //var doubleOfNumbers =ListOfNumbers.map( x => x * 2)
    var doubleOfNumbers =ListOfNumbers.map( _ * 2)

    println(doubleOfNumbers)
  }

 // def square(x: Int) ={x * x}   //Traditional Way

  var square = (x:Int) => x * x  // Anonymous Function Way

}

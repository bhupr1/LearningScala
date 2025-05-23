// Closures : Variables are defined outside of function definition

package Function_Programming

object DemoUClosures {
  def main(args: Array[String]): Unit = {
    println(multipler(5))
    println(multipler1(10))
  }

 // def multipler(x:Int) ={
  //  x * 10
  //}
  var factor = 9
  val multipler = (x:Int) => x * factor

  // if variable (eg:factor) is defined outside the function body, it is called as closure
  //if variable used inside function body is neither a input parameter nor defined inside function body

  // Note : Below function is not closure because factor1 is defined inside the function body
  val multipler1 = (y: Int) => {
    val factor1 = 10
    y * factor1
  }
}

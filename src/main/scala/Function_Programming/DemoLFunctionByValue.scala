package Function_Programming

object DemoLFunctionByValue {

  def main(args: Array[String]): Unit = {
    println("Main Function: "+exec(time()))
  }
  def time() :Long ={
    println("Inside time function")
    return System.nanoTime()
  }
  def exec(t:Long) :Long = {
    println("Entering exec function")
    println("Time: " +t)
    println("Existing from exec function")
    return t
  }
}
/*Points to remember
1. it will first execute the inside function "time()" and then execute outside function "exec(81683046397500)"
2. Since Inside function "time()" got executed first, it calls outside function "exec(81683046397500)"
// using the value 81683046397500 ,it is called as "Function by value"
 */
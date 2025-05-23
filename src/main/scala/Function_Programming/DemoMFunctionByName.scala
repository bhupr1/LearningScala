package Function_Programming

object DemoMFunctionByName {
  def main(args: Array[String]): Unit = {
    println("Main Function: "+exec(time()))
  }
  def time() :Long ={
    println("Inside time function")
    return System.nanoTime()
  }
  def exec(t: => Long) :Long ={
    println("Entering exec function")
    println("Time: " + t)
    println("Existing from exec function")
    return t
  }

}
/*Points to remember
1. it will first execute the OUTSIDE function "exec()" and then execute INSIDE function "time()"` everytime t is being referred
2. Since OUTSIDE function "exec()" got executed first, it calls inside function "time()"
// using the REFERENCED variable  t ,it is called as "Function by name"
 */
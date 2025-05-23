//Without partially applied function

package Function_Programming
import java.util.Date

object DemoNPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    var date = new Date()
    val logWithDate = log(date,_:String)  //Partially Applied Function. _ will be parameter that is expected by partially applied function
  //  log(date, msg="Hello 1")
    logWithDate("Hello 1")
    Thread.sleep(2000)
 //   log(date, msg="Hello 2")
    logWithDate("Hello 2")

    Thread.sleep(2000)
  //  log(date, msg="Hello 3")
    logWithDate("Hello 3")


  }



  def log(date: Date,msg:String) ={
    println(msg + date)

  }

}

//Variable Number of Arguments in Functions
package Function_Programming

object DemoCVariableNoOfArguments {

  def PrintMultipleTimes(n:Int, args:String*):Unit ={  //String* means you are defining Array[String]
    for (arg <- args)
      {
        println(arg * n)
      }
  }

  def main(args: Array[String]): Unit = {
    PrintMultipleTimes(3,"Hello ", "World ", "India ","Singapore ")
  }
}
//Note1 :: Variable number of arguments i.e  args:String* Should always be at the end
//Note2 :: You can not have more than args:String*
package Function_Programming

object DemoQNestedFunction {
  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("India")
  }
    def printHello(str:String)={
      def printSomeThing(str1:String,str2:String)={
        println(str1+" "+str2)
      }
      printSomeThing("Hello",str)
    }


}

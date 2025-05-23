package Function_Programming

object DemoGAnonymousFunctions {

  def main(args: Array[String]): Unit = {
    var ListOfNumbers = List(0,1,2,3,4,5,6,7,8,9,10)
    ListOfNumbers.foreach(num =>
      if(divisibleByThree(num)) println(num + " is divisible by three")
      else println(num + " is not divisible by three")
    )
    // Use With Filter
    //var divisibleByThreeOutput =ListOfNumbers.filter((x:Int) => x%3 == 0)
    //var divisibleByThreeOutput =ListOfNumbers.filter(x => x%3 == 0)
    var divisibleByThreeOutput =ListOfNumbers.filter(_%3 == 0)
    divisibleByThreeOutput.foreach(x =>println(x))
    println(divisibleByThreeOutput)
  }



  ////Traditional Way
  //def divisibleByThree (x:Int) ={
  //  x%3 == 0
  //}
  //Using Function value / Anonymous Function
  var divisibleByThree = (x:Int) => (x%3 == 0)
}

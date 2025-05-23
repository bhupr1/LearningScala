package Function_Programming

object DemoOPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
   // fourWheeler("Mercedes","car",200000)
    car("Mercedes")
    car("BMW")
    fourWheeler("TATA","Taizen",500000)
    truck("BMW")
  }

  val car = fourWheeler(_:String,"car",200000)  //Partially Implemented function
  val truck = fourWheeler(_:String,"Truck",500000) //Partially Implemented function

  val fourWheeler = (vehicleName:String,vehicleType:String,vehicleCost:Int) => {
    println("Vehicle Name is: "+ vehicleName +", Vehicle Type is: " + vehicleType + ", Vehicle Cost is: "+ vehicleCost)
  }


  /*def fourWheeler(vehicleName:String,vehicleType:String,vehicleCost:Int) ={
  println("Vehicle Name is: "+ vehicleName +", Vehicle Type is: " + vehicleType + ", Vehicle Cost is: "+ vehicleCost)
}*/

}

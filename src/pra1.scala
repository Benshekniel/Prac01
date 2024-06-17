object Solutions {
  def main(args: Array[String]): Unit = {
    // 1. Area of a disk with radius 5
    val radiusDisk = 5
    val areaDisk = calculateAreaOfDisk(radiusDisk)
    println(s"The area of the disk with radius $radiusDisk is $areaDisk")

    // 2. Convert 35C to Fahrenheit
    val celsiusTemp = 35
    val fahrenheitTemp = celsiusToFahrenheit(celsiusTemp)
    println(s"The temperature $celsiusTemp°C is $fahrenheitTemp°F")

    // 3. Volume of a sphere with radius 5
    val radiusSphere = 5
    val volumeSphere = calculateVolumeOfSphere(radiusSphere)
    println(s"The volume of the sphere with radius $radiusSphere is $volumeSphere")

    // 4. Total wholesale cost for 60 copies of a book
    val coverPrice = 24.95
    val discount = 0.4
    val numOfCopies = 60
    val totalCost = calculateWholesaleCost(coverPrice, discount, numOfCopies)
    println(s"The total wholesale cost for $numOfCopies copies is Rs. $totalCost")

    // 5. Total running time
    val totalRunningTime = calculateTotalRunningTime()
    println(s"The total running time is $totalRunningTime minutes")
  }

  def calculateAreaOfDisk(radius: Double): Double = {
    math.Pi * radius * radius
  }

  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  def calculateVolumeOfSphere(radius: Double): Double = {
    (4.0 / 3.0) * math.Pi * math.pow(radius, 3)
  }

  def calculateWholesaleCost(coverPrice: Double, discount: Double, copies: Int): Double = {
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost = if (copies > 50) {
      3 + (copies - 50) * 0.75
    } else {
      3
    }
    (discountedPrice * copies) + shippingCost
  }

  def calculateTotalRunningTime(): Int = {
    val easyPacePerKm = 8
    val tempoPacePerKm = 7
    val easyDistance = 2
    val tempoDistance = 3
    (easyDistance * easyPacePerKm * 2) + (tempoDistance * tempoPacePerKm)
  }
}

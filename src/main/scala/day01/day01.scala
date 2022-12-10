package day01


object day01 extends App {

  val itemList =
    """1000
      |2000
      |3000
      |
      |4000
      |
      |5000
      |6000
      |
      |7000
      |8000
      |9000
      |
      |10000""".stripMargin

  // Convert Input String to List
  val list = itemList.split("\n").toList

  // Split the list wherever there is a blank line
  val elves = list.foldLeft(List(List[String]())) {
    case (acc, elem) =>
      if (elem == "") acc :+ List[String]()
      else acc.init :+ (acc.last :+ elem)
  }

  // Sum up the calories for each elve
  val elvesCalories = elves.map(_.map(_.toInt).sum)

  val maxCalorieElve = elvesCalories.max

  println(maxCalorieElve)
}

package day02

trait Outcome {}

case object Win extends Outcome
case object Draw extends Outcome
case object Loss extends Outcome

trait Choice {
  def vs(choice: Choice): Outcome
  def calcChoice(outcome: Outcome): Choice
  def value: Int
}

case object Rock extends Choice {
  def vs(choice: Choice): Outcome =
    choice match {
      case Rock => Draw
      case Paper => Loss
      case Scissors => Win
    }

  def calcChoice(outcome: Outcome): Choice =
    outcome match {
      case Win => Scissors
      case Draw => Rock
      case Loss => Paper
    }

  def value: Int = 1
}

case object Paper extends Choice {
  def vs(choice: Choice): Outcome =
    choice match {
      case Rock => Win
      case Paper => Draw
      case Scissors => Loss
    }

  def calcChoice(outcome: Outcome): Choice =
    outcome match {
      case Win => Rock
      case Draw => Paper
      case Loss => Scissors
    }

  def value: Int = 2
}

case object Scissors extends Choice {
  def vs(choice: Choice): Outcome =
    choice match {
      case Rock => Loss
      case Paper => Win
      case Scissors => Draw
    }

  def calcChoice(outcome: Outcome): Choice =
    outcome match {
      case Win => Paper
      case Draw => Scissors
      case Loss => Rock
    }

  def value: Int = 3
}

object day02 {

  val input = "C Z\nC Z\nA Y\nA X\nC Z\nC Z\nA X\nC X\nA X\nC X\nA X\nA X\nA X\nA X\nC Y\nA X\nA X\nA Y\nC Z\nC X\nC Z\nC Y\nB Y\nC Y\nC X\nC X\nA Z\nC Y\nA Z\nA Z\nB X\nA Y\nA X\nB Y\nC X\nA X\nA X\nC Z\nC Y\nB X\nA Y\nC Z\nC Y\nC Z\nC Z\nA X\nC Z\nC Y\nC X\nC Z\nA X\nC Z\nA Y\nA X\nA X\nA X\nA X\nC X\nA X\nA X\nC X\nA X\nC Y\nC Y\nA X\nC Z\nC Y\nA X\nC Z\nC Y\nC Z\nC Z\nB X\nC Z\nC X\nC X\nB Z\nA X\nA X\nC Z\nC X\nC X\nA X\nA Y\nC X\nC Y\nA X\nC Z\nA Z\nC Z\nA Z\nA Z\nC X\nA X\nA X\nC Z\nC Y\nC Z\nA X\nA X\nC X\nA X\nC X\nA X\nA Z\nA Y\nC Y\nA Y\nC Z\nA X\nA Y\nC X\nA Z\nC Y\nC Z\nC Z\nA Y\nC Z\nA Z\nC Z\nA Z\nA Z\nA X\nC X\nA Y\nA X\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nC X\nA Z\nA X\nA Z\nA X\nC Z\nA X\nC X\nA X\nA X\nC X\nC Z\nC Y\nC Z\nA Y\nC Z\nC Z\nA X\nC X\nB X\nC X\nA X\nC Y\nC Z\nC Z\nC Z\nA Z\nC Y\nA X\nC X\nB X\nB X\nC Y\nC X\nA X\nC X\nC X\nA Y\nC Z\nA X\nA X\nA X\nC Z\nA X\nC Z\nC Y\nC Z\nC X\nA X\nC Z\nA X\nC Z\nC X\nC X\nA X\nC Z\nC Z\nC X\nA Y\nB X\nB Z\nA Z\nC Z\nA X\nA X\nA X\nC X\nC X\nC Y\nC Z\nA Y\nB Z\nA X\nC X\nC X\nC X\nC Y\nC X\nA X\nA X\nA Z\nA X\nA X\nC Z\nC Z\nC Z\nA X\nC X\nC X\nC Y\nA X\nC Z\nA Z\nC X\nA X\nC X\nC Z\nA X\nA X\nC Z\nC X\nC Y\nA X\nC Y\nC Z\nA Z\nC X\nA X\nA X\nA X\nA Z\nC X\nC X\nA X\nA X\nB X\nC Y\nC X\nC Z\nC Y\nA X\nC X\nC Z\nC Y\nC Y\nC X\nC Y\nB X\nC X\nC Y\nA X\nC Z\nC Y\nA X\nA X\nC X\nA X\nA X\nA Z\nC X\nA Z\nC X\nC X\nC X\nC Y\nA Z\nC Z\nA X\nB X\nC X\nA X\nA Z\nC X\nC Z\nB X\nC X\nA X\nA Y\nA Z\nC Z\nC Z\nC X\nA Z\nC Z\nC Z\nC X\nC Y\nC Z\nC Z\nC X\nA Z\nC Z\nC X\nA X\nA X\nA X\nA Z\nA Z\nC Z\nA X\nC X\nA X\nC X\nC Z\nC X\nC X\nA X\nC X\nB Y\nA X\nB X\nA X\nC X\nC Z\nA X\nC X\nA X\nA X\nC Z\nC X\nC X\nC X\nC Z\nA X\nB X\nA Z\nC X\nB Z\nC Z\nB Z\nC Z\nA Y\nA X\nB Y\nA X\nA X\nC Z\nC X\nA X\nB X\nC X\nB Z\nC Z\nA X\nA X\nA X\nA X\nA X\nA X\nA X\nC Y\nA Y\nC X\nC Z\nC X\nC Y\nC Z\nC X\nA X\nC Z\nA X\nA Z\nC X\nC Z\nC Y\nA X\nC X\nC Z\nA X\nA Y\nC X\nA X\nC Y\nA Y\nC Y\nA Z\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nA Z\nC X\nC Z\nB X\nC X\nA X\nA Y\nA X\nC Z\nA Y\nA Y\nC X\nB Z\nC X\nA X\nA X\nA X\nA X\nA X\nC X\nC Z\nA Z\nA X\nC Y\nC Z\nA X\nA Z\nB Z\nA Z\nA X\nC Y\nC X\nC X\nC X\nB Z\nA X\nC Y\nA X\nA X\nA X\nC Y\nA X\nB X\nC X\nC X\nC Z\nC Z\nA X\nC Y\nA Z\nA X\nC X\nA X\nC X\nC X\nC Z\nA X\nC Y\nC Y\nA X\nA Z\nA Z\nA X\nC X\nA X\nC Y\nB X\nA X\nC Y\nC X\nB X\nC Z\nA X\nA X\nC X\nC Z\nC Z\nC X\nC Y\nC Y\nA X\nC Z\nC X\nC Y\nC X\nA X\nA X\nA X\nB Y\nC X\nA X\nC X\nC X\nA X\nC Z\nC Z\nC X\nB X\nA Y\nA Y\nC Z\nC Y\nC X\nC Y\nB Y\nA Z\nC X\nA X\nA Z\nA Y\nC X\nA Z\nC Z\nC Y\nC Z\nA X\nC X\nC Z\nC X\nC X\nA X\nC Z\nA Z\nC X\nC Y\nC X\nA X\nA Z\nC Z\nC X\nA Z\nB Z\nC Y\nB X\nA Y\nB X\nB Y\nA Y\nA X\nA Z\nC X\nC X\nA X\nC X\nC Z\nC Y\nA Z\nA X\nC Z\nA X\nA X\nA Z\nA X\nA X\nC Z\nA X\nC X\nA X\nA X\nA Y\nC Z\nA X\nC Z\nA Z\nA X\nA X\nA Y\nC Z\nA Z\nA Z\nA X\nC X\nA X\nA X\nC Z\nC X\nC X\nC X\nC Y\nC X\nA X\nB X\nB X\nC Z\nC Z\nC Z\nC X\nB Y\nA Y\nB X\nB X\nC X\nC X\nC X\nA X\nC Y\nA Z\nA X\nC X\nA X\nA X\nA X\nB X\nC Y\nA X\nC Z\nA X\nC X\nA X\nC Z\nC X\nA X\nA Z\nA X\nA X\nA X\nC Z\nA Y\nB X\nA X\nB X\nC Z\nA X\nA X\nC Y\nC Z\nC Z\nA X\nC X\nA X\nA X\nA X\nA X\nA X\nC X\nA X\nC Y\nC X\nB X\nA X\nC Y\nC Z\nA X\nA X\nC X\nA Z\nA X\nA Z\nA X\nC Z\nA X\nB X\nC X\nA X\nC X\nA X\nC Y\nC Z\nA X\nC Z\nC Z\nC X\nB X\nC Z\nA X\nA Z\nC X\nA X\nC X\nC Z\nC Z\nC Y\nC Z\nA X\nC X\nC Z\nA Z\nC Z\nA Z\nC X\nC Z\nA X\nA X\nB X\nA Z\nB X\nC Y\nC Z\nC X\nA X\nC Z\nC Z\nC Z\nB X\nC X\nC X\nA Z\nA X\nC Y\nA X\nB Z\nB X\nA X\nC Y\nB X\nC Z\nC Y\nC Z\nA X\nC Y\nA X\nA X\nA Z\nA X\nA X\nC X\nC Y\nC Z\nC Z\nC Y\nB Y\nC Z\nA X\nA X\nC X\nC X\nC X\nA X\nC Y\nA X\nA Y\nA X\nC X\nC Y\nC Y\nB X\nA X\nC Z\nA X\nC Z\nC X\nA X\nA Z\nC X\nC Y\nA X\nA Z\nA Z\nC Y\nA X\nC Z\nC Z\nA X\nA Z\nB X\nA X\nC Y\nC X\nB Z\nC Z\nA X\nC Y\nA X\nC Y\nA Z\nA X\nC X\nC Y\nB X\nA X\nB X\nA X\nA X\nB Y\nA X\nA X\nC X\nA X\nC X\nA X\nA X\nC Y\nA X\nC Z\nC Z\nA Z\nC X\nA Z\nC Y\nC Z\nC X\nA X\nC Z\nA X\nC Y\nA X\nA Z\nC Y\nC X\nC X\nC Z\nB X\nA X\nA X\nA Z\nC Z\nC X\nA X\nC X\nA Z\nA Z\nA X\nC X\nC Z\nB Z\nC X\nC X\nA X\nA X\nA X\nC Y\nC X\nA X\nC Z\nA X\nB Y\nA X\nA X\nC X\nB X\nA X\nC X\nB Y\nA Z\nC X\nC X\nA X\nA X\nA X\nC Y\nC X\nA Z\nC X\nA X\nC Z\nC Z\nC Y\nA X\nA X\nB Z\nC Y\nC Z\nA X\nC Z\nA X\nC Z\nB X\nA Z\nA Z\nC X\nA X\nC Z\nC X\nA X\nA X\nC X\nC Z\nC X\nA X\nC X\nA X\nA X\nC Z\nC X\nA X\nA X\nA X\nA X\nC Y\nA X\nC X\nC Z\nC Y\nC Z\nC X\nC Z\nA X\nC X\nC Z\nC Z\nC Z\nB X\nC X\nA Z\nA Z\nA X\nC X\nC Z\nB Z\nC Z\nC Z\nA Y\nA Y\nC X\nA X\nA X\nA Z\nA X\nA Y\nA Z\nA X\nA X\nC Z\nC Z\nA Y\nA X\nB X\nA X\nA X\nC X\nA X\nA Z\nC Z\nC X\nC Z\nC X\nA Z\nB X\nA X\nA X\nC X\nB Y\nA X\nC Z\nA X\nA Y\nA Z\nA X\nC Z\nA Z\nB X\nC Z\nC Y\nA X\nC Y\nA X\nC X\nC X\nC X\nA X\nC X\nC Z\nC Y\nA Z\nC X\nC Y\nA X\nA X\nC Z\nA X\nC X\nC X\nA X\nA X\nA Z\nC X\nC Z\nA Z\nA Z\nA X\nB X\nB X\nA X\nC Z\nA Z\nC Z\nC X\nC Z\nB X\nC X\nC X\nB Z\nA X\nA Z\nB Z\nB Z\nC X\nA Z\nA X\nA Y\nC X\nA X\nC Z\nA X\nC X\nA X\nC Z\nC X\nC X\nC X\nC Z\nB Z\nA X\nA X\nA X\nC Z\nA X\nA X\nC X\nB Z\nC X\nC X\nA X\nB Y\nC X\nC X\nC X\nA X\nC X\nA Z\nC Y\nB Z\nA X\nC Z\nC Z\nC Z\nC Z\nA Y\nC Z\nA X\nA X\nC X\nC X\nA X\nC X\nA Z\nA X\nC Z\nC X\nA X\nC Z\nC X\nC Z\nB Z\nA X\nC Y\nC Z\nA X\nA X\nC Y\nA Z\nC X\nC Z\nC Z\nC Y\nC Z\nA X\nC X\nA X\nA X\nC X\nA X\nC Z\nA X\nA Z\nA X\nC Z\nC Z\nB X\nC Z\nA Y\nA Z\nA X\nC Y\nC X\nC Y\nA X\nA Z\nA X\nA X\nA X\nC X\nB X\nC X\nA Y\nA Y\nC Z\nA X\nA X\nA Z\nC X\nA X\nA Z\nC Z\nC Z\nC X\nC X\nA X\nA X\nC Z\nA X\nC Z\nC Z\nB Z\nA X\nA X\nC Z\nA X\nC Z\nC Y\nC X\nA X\nA Z\nA X\nA X\nA X\nC Y\nC Z\nA X\nC Y\nC Z\nC Z\nA X\nA Z\nA X\nC Z\nC Y\nC Z\nC Y\nA X\nC X\nA X\nA X\nA X\nC X\nA X\nA X\nC Y\nC X\nA X\nC X\nA Z\nA X\nC Z\nC X\nB Z\nC Z\nA X\nC Y\nC Z\nC X\nA X\nA X\nB Y\nA X\nB X\nC X\nA X\nA X\nC X\nC Y\nA X\nA X\nA X\nC X\nC Z\nA X\nB X\nC Y\nC Y\nA X\nC Y\nC X\nA X\nC X\nA X\nA X\nA X\nC X\nC X\nB Z\nA X\nC X\nA X\nC Z\nA X\nC Y\nA X\nC Z\nC Z\nC Y\nA X\nA Z\nA X\nC X\nC Z\nA X\nC Z\nC X\nC Z\nA X\nC Y\nA X\nC Z\nC Y\nC X\nA X\nA Y\nB X\nA X\nA Y\nA X\nA X\nA X\nA X\nC Z\nC Y\nB X\nA X\nC X\nA X\nC X\nA X\nA Y\nA X\nC Z\nA Z\nC X\nA X\nA X\nA X\nC Z\nC Z\nC Y\nC X\nA X\nC X\nC Y\nA Z\nC X\nA X\nC Y\nC Z\nC Z\nA X\nA X\nC Z\nC Z\nC X\nC X\nC X\nC Z\nC Y\nC X\nB Z\nC Z\nA X\nC Z\nA X\nA X\nC X\nC X\nC Y\nA Y\nA X\nC X\nA X\nC X\nC X\nA X\nA X\nA Y\nC Z\nC Y\nA X\nA X\nA X\nA X\nC X\nC Y\nA X\nA Y\nA X\nA X\nC X\nA Z\nC Z\nC Z\nC Z\nC Z\nA X\nC Z\nC X\nC X\nB X\nC X\nC Z\nC X\nA Z\nC Z\nB X\nB Z\nC Y\nA X\nB X\nA X\nA X\nA X\nC X\nC X\nA X\nC Y\nA X\nC Y\nB Y\nC Y\nA X\nC X\nC Y\nC Z\nC X\nA X\nA X\nC X\nB X\nC Z\nC X\nA X\nA Z\nA X\nC Z\nC X\nB X\nA Z\nA X\nB Z\nC Z\nA X\nC Y\nA X\nC Z\nB X\nC X\nC X\nC Y\nA X\nA X\nA X\nC Z\nC X\nB Z\nC Z\nB X\nB Z\nA X\nA Z\nA X\nC X\nC X\nC Z\nC X\nC X\nB Y\nA X\nA X\nA X\nA X\nA X\nA X\nC X\nA Z\nA Z\nC X\nC X\nA X\nB Y\nC X\nC X\nA Z\nA X\nB X\nA X\nC X\nC Z\nC Y\nC Z\nC Z\nB X\nC Y\nC X\nA X\nA X\nC X\nC Y\nC Z\nA X\nC X\nA X\nB Z\nA X\nC Y\nC X\nC X\nA X\nC Z\nC Z\nA X\nC X\nC X\nC X\nA X\nA Z\nC X\nA X\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nA Z\nC X\nA X\nA X\nC Z\nA X\nA X\nA X\nC X\nA X\nA X\nC Z\nC X\nC Y\nB X\nC X\nC Y\nC X\nA X\nA Y\nA X\nA X\nA Z\nC Z\nA X\nC X\nC X\nC X\nC X\nB Z\nA X\nB Y\nC X\nC X\nC Y\nC X\nC Z\nC Z\nA X\nC X\nA X\nC X\nA Z\nC Y\nB X\nA X\nC X\nC Z\nC Y\nB X\nC Y\nA X\nC X\nA X\nA X\nA Z\nA X\nB X\nC X\nA X\nA Y\nA X\nC X\nC Z\nA Z\nA X\nA X\nC Z\nA X\nC X\nA X\nC X\nA X\nC Z\nC Y\nA X\nC X\nA X\nC Z\nA Y\nB X\nC Z\nC Z\nA X\nA X\nA Y\nA Z\nA X\nC X\nC Y\nC Z\nA X\nC Z\nC Z\nB X\nA X\nA X\nA X\nC Y\nA Z\nC Z\nC Z\nA Z\nA X\nA X\nB X\nC X\nB X\nA X\nC Z\nA Y\nC Z\nA X\nC X\nC Z\nC X\nA X\nC X\nA X\nA X\nC Z\nA Z\nC X\nC X\nB Z\nC Z\nA Y\nA X\nC X\nC Z\nA X\nC Z\nC X\nC Y\nC X\nA Y\nC Z\nC Z\nA X\nA X\nA X\nC Z\nC Y\nC Z\nA X\nC Z\nA X\nC X\nA X\nA Y\nA X\nA Z\nA X\nA Y\nA X\nA X\nA X\nA Z\nA X\nC Z\nC Z\nC Z\nC X\nA X\nA Z\nC X\nC Z\nA X\nC X\nC Y\nA X\nC X\nA X\nC Y\nA X\nA X\nC Z\nC X\nA X\nC Z\nA X\nA X\nC Z\nC X\nC Z\nC Y\nA Y\nC Z\nC X\nB X\nA X\nA X\nA Z\nA X\nA X\nC X\nC Z\nA X\nC X\nA Z\nB X\nA Z\nC Z\nC Z\nA X\nB X\nA X\nA Y\nA X\nA X\nC Z\nA X\nC Y\nC Z\nC Y\nA X\nA X\nA X\nA X\nB Z\nB Z\nA X\nC X\nC X\nA X\nC X\nC Y\nB X\nC Y\nB X\nA X\nB Z\nC Z\nA X\nA X\nC X\nA Z\nA X\nC X\nC Z\nA X\nC X\nC X\nC X\nC Z\nC Y\nA X\nA X\nA X\nC Z\nC Z\nC X\nC Z\nB X\nA X\nC Z\nC Z\nC Y\nA X\nA X\nC Z\nA Z\nC X\nC Z\nC Y\nC Z\nC Z\nA X\nC Z\nC Y\nC X\nB X\nC Z\nA Y\nC Z\nC X\nC X\nA X\nA X\nA X\nC Z\nB Z\nA X\nA Z\nB X\nA Z\nA Z\nC Z\nC Z\nC X\nC Y\nC Y\nC Z\nA Z\nC Y\nC X\nC Y\nA Z\nB Y\nA X\nC Y\nA X\nA X\nA Z\nC Z\nC Z\nC Z\nC X\nC X\nC Z\nC Z\nA X\nC X\nA Y\nA Y\nA X\nB Z\nA X\nC X\nA X\nC X\nA X\nA X\nA X\nC X\nC Y\nC Z\nC Z\nA X\nC Z\nA X\nC X\nC X\nC Z\nA X\nA X\nA X\nC X\nC Z\nA X\nA X\nA X\nA X\nC Z\nB Y\nA X\nA X\nA X\nC Y\nA X\nA X\nA Z\nC X\nA Z\nC Z\nA Z\nC Z\nA X\nA Z\nA X\nA X\nA X\nA X\nA Y\nC X\nC Z\nA X\nA Z\nC X\nA Y\nC Z\nC Y\nA X\nB X\nA Y\nC X\nA X\nC Z\nC X\nA X\nC Z\nC X\nA X\nC X\nC X\nC Z\nA X\nA Y\nC Y\nC Y\nA X\nA X\nA X\nA X\nA X\nC X\nA Y\nC Z\nC Z\nC Y\nA X\nC Z\nC Z\nA X\nC X\nC X\nC Y\nA X\nA X\nC X\nC X\nA Z\nA X\nC Z\nA X\nC Z\nA X\nB X\nA Z\nB X\nC Z\nC Z\nC X\nA X\nA Z\nC X\nA X\nA X\nC X\nC Y\nC Z\nC X\nC X\nA X\nC Z\nC Z\nC X\nB X\nC Z\nA X\nB X\nA Z\nC X\nA Z\nA X\nA X\nC X\nA X\nC Z\nA X\nA X\nC Z\nC Z\nC Z\nA X\nC X\nA Y\nC Y\nA X\nA X\nA X\nA X\nC X\nC Z\nA X\nA X\nA X\nC X\nC Z\nA X\nC Z\nA X\nA Y\nC Y\nC X\nC X\nA X\nA X\nA X\nA Z\nA X\nC Z\nA X\nC Y\nB Z\nB X\nA X\nC X\nC Z\nA X\nA X\nC Z\nB X\nB X\nC X\nC Y\nC X\nB X\nA X\nA X\nC X\nA Z\nA X\nC X\nC X\nC X\nA X\nC Z\nA Y\nA X\nC Y\nA X\nA X\nC Z\nA Z\nA Z\nC X\nC X\nC Y\nC Y\nC X\nC X\nC Z\nA X\nC X\nA X\nA X\nA X\nA X\nC Y\nC Z\nA X\nC Z\nC X\nC X\nA X\nA X\nA Z\nC Y\nC X\nA X\nC X\nA X\nA Z\nA X\nA Z\nA X\nA X\nA X\nC X\nA Z\nA X\nC X\nC Y\nA Z\nA X\nB X\nC X\nC Y\nC Z\nC X\nC Y\nC X\nC X\nA X\nC Y\nB X\nA Z\nC Z\nB Z\nC X\nA X\nC Z\nA X\nC X\nA X\nA X\nA X\nC Z\nC Y\nB Z\nA X\nC X\nA Y\nC Z\nA X\nA X\nA Z\nA Z\nA Y\nC X\nC Z\nC X\nA Z\nC X\nC Z\nC X\nB X\nA X\nC Z\nA X\nA X\nC Z\nA Z\nC X\nC Y\nC X\nC X\nC Y\nA X\nA X\nC X\nA Z\nC X\nC Z\nC X\nA Z\nA X\nA Y\nA X\nA X\nB Z\nC Z\nC Z\nA Y\nC X\nA X\nB X\nA X\nA Z\nC Y\nC Z\nC X\nC Z\nC Z\nC X\nC X\nA X\nC X\nA Z\nC Z\nC Z\nC Z\nC Y\nC X\nA X\nC Z\nA Z\nC Z\nC Z\nA X\nC X\nA X\nC Z\nA X\nB X\nA X\nC Z\nC X\nC X\nA X\nC Y\nA X\nC Z\nB X\nC Z\nC X\nA X\nC X\nC X\nC Z\nA X\nA X\nC Z\nC Z\nC X\nC Z\nC X\nA X\nA X\nC Z\nC X\nC X\nA X\nC Z\nA Z\nC Z\nB X\nC X\nC Y\nC X\nC Z\nA X\nB X\nC Z\nA X\nC Z\nA Z\nC Z\nC X\nA X\nC Z\nC Z\nA X\nA X\nC Z\nA X\nC Y\nA Z\nC X\nC Z\nA X\nB Z\nB X\nA X\nA Z\nA X\nA Z\nA X\nA X\nC Y\nA X\nC Y\nC X\nC Y\nC Y\nC X\nA X\nA Z\nA Z\nC X\nC Z\nB X\nA X\nC Z\nA Z\nC X\nC Z\nC Y\nA X\nA X\nC Z\nC Z\nC Y\nA Z\nC Z\nC Y\nA X\nC X\nA X\nC X\nC Z\nA Z\nB Z\nA X\nA X\nA X\nC X\nC X\nA Y\nA Z\nC X\nC Z\nA X\nB X\nA X\nA X\nC X\nC X\nB X\nA X\nB X\nC Z\nA Z\nC Z\nA X\nC X\nC Z\nC Y\nA Y\nA Z\nC Y\nC Z\nA X\nA X\nC X\nA X\nC Z\nC Y\nA X\nC Z\nA X\nA X\nB X\nA X\nA Z\nC X\nC Y\nA Z\nC Z\nA X\nA Z\nC X\nC Z\nC X\nC Z\nA X\nA X\nA X\nC X\nA X\nC Z\nC X\nC X\nC X\nC X\nA X\nC X\nB Y\nA Z\nA Z\nC Z\nC X\nA Y\nC X\nA X\nC X\nC Z\nB Z\nC Z\nB X\nA X\nA Z\nA X\nC X\nA X\nC Z\nC Z\nC Z\nA X\nC Z\nA X\nC Z\nC X\nC X\nC X\nB X\nA X\nA X\nB X\nC X\nA X\nC Z\nA Z\nC Y\nC Z\nA Z\nB Z\nA Z\nC Z\nC Z\nC X\nA X\nA X\nC X\nC X\nC Y\nA Y\nA Z\nA X\nC Z\nC Z\nC Y\nC X\nA X\nA X\nC Y\nA Z\nC X\nC X\nC X\nA X\nC X\nC X\nA Z\nC X\nC Y\nA Z\nC Z\nC Y\nA Z\nC Z\nA X\nC X\nC Y\nC X\nC X\nC Z\nC X\nC X\nC Z\nC X\nA X\nB Y\nA X\nC X\nB Z\nC Z\nC X\nC Z\nC Z\nA Y\nA Y\nA X\nA Z\nC Z\nA X\nC X\nC Z\nA Z\nA X\nA X\nA X\nB X\nA X\nB Z\nC X\nA X\nC X\nA Z\nC X\nA X\nC Y\nA X\nC X\nC Y\nA Z\nC Z\nC Z\nB X\nA X\nC X\nA X\nC X\nC Y\nA X\nC Y\nA X\nB X\nC Y\nA X\nA X\nC X\nA X\nB Y\nC Y\nC Y\nC Y\nC X\nA Y\nC X\nC Z\nA X\nA Z\nA X\nA X\nC Z\nA Z\nA Z\nC X\nA X\nA X\nB X\nC X\nC Y\nC X\nB Z\nA X\nC X\nC Y\nC X\nC Z\nC Y\nA X\nC X\nA X\nA X\nA Y\nC Z\nC Z\nC Z\nA X\nA X\nA Z\nA X\nA X\nA Z\nA X\nC Y\nC Y\nA X\nA X\nA Z\nC X\nA X\nC Z\nA Z\nC Z\nC Y\nC Z\nA X\nC Z\nC X\nC Z\nA X\nC Y\nC Y\nB X\nA X\nA Z\nC X\nA X\nA X\nC Z\nA X\nC X\nC Z\nA Z\nA Y\nA Y\nA X\nC X\nA Y\nA X\nA X\nB Z\nA X\nC X\nC X\nC X\nA X\nC X\nC Z\nC Z\nA Z\nC X\nC X\nC Y\nA X\nC X\nA X\nA X\nC Y\nC X\nA X\nC Y\nC X\nC X\nA Y\nC Z\nC X\nC X\nC Y\nC Z\nA Y\nA X\nC Z\nC Z\nC Z\nC X\nC Z\nA X\nA X\nA Z\nA X\nC Y\nC X\nC Z\nA X\nA X\nC Z\nA X\nC X\nA X\nA Y\nC X"

  def convertToChoice(input: Char): Choice = {
    input match {
      case 'A' => Rock
      case 'B' => Paper
      case 'C' => Scissors
    }
  }

  def convertToOutcome(input: Char): Outcome = {
    input match {
      case 'X' => Loss
      case 'Y' => Draw
      case 'Z' => Win
    }
  }

  def main(args: Array[String]): Unit = {

    val strategyGuideRaw: List[(Char, Char)] = input.split("\n").map(line => (line(0), line(2))).toList
    val strategyGuide: List[(Choice, Choice)] = strategyGuideRaw
      .map(pair => (convertToChoice(pair._1), convertToOutcome(pair._2)))
      .map(pair => (pair._1, pair._1.calcChoice(pair._2)))

    def play(opponent: Choice, you: Choice): Int = {
      opponent.vs(you) match {
        case Win => 0 + you.value
        case Draw => 3 + you.value
        case Loss => 6 + you.value
      }
    }

    val totalScore: Int = strategyGuide.map(pair => play(pair._1, pair._2)).sum
    println(totalScore)
  }
}


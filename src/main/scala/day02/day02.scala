package day02

trait Outcome {}

case object Win extends Outcome
case object Draw extends Outcome
case object Loss extends Outcome

trait Choice {
  def beats(choice: Choice): Outcome
  def value: Int
}

case object Rock extends Choice {
  def beats(choice: Choice): Outcome = {
    choice match {
      case Rock => Draw
      case Paper => Loss
      case Scissors => Win
    }
  }

  def value: Int = 1
}

case object Paper extends Choice {
  def beats(choice: Choice): Outcome = {
    choice match {
      case Rock => Win
      case Paper => Draw
      case Scissors => Loss
    }
  }

  def value: Int = 2
}

case object Scissors extends Choice {
  def beats(choice: Choice): Outcome = {
    choice match {
      case Rock => Loss
      case Paper => Win
      case Scissors => Draw
    }
  }

  def value: Int = 3
}

object day02 {

  val input = "C Z\nC Z\nA Y\nA X\nC Z\nC Z\nA X\nC X\nA X\nC X\nA X\nA X\nA X\nA X\nC Y\nA X\nA X\nA Y\nC Z\nC X\nC Z\nC Y\nB Y\nC Y\nC X\nC X\nA Z\nC Y\nA Z\nA Z\nB X\nA Y\nA X\nB Y\nC X\nA X\nA X\nC Z\nC Y\nB X\nA Y\nC Z\nC Y\nC Z\nC Z\nA X\nC Z\nC Y\nC X\nC Z\nA X\nC Z\nA Y\nA X\nA X\nA X\nA X\nC X\nA X\nA X\nC X\nA X\nC Y\nC Y\nA X\nC Z\nC Y\nA X\nC Z\nC Y\nC Z\nC Z\nB X\nC Z\nC X\nC X\nB Z\nA X\nA X\nC Z\nC X\nC X\nA X\nA Y\nC X\nC Y\nA X\nC Z\nA Z\nC Z\nA Z\nA Z\nC X\nA X\nA X\nC Z\nC Y\nC Z\nA X\nA X\nC X\nA X\nC X\nA X\nA Z\nA Y\nC Y\nA Y\nC Z\nA X\nA Y\nC X\nA Z\nC Y\nC Z\nC Z\nA Y\nC Z\nA Z\nC Z\nA Z\nA Z\nA X\nC X\nA Y\nA X\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nC X\nA Z\nA X\nA Z\nA X\nC Z\nA X\nC X\nA X\nA X\nC X\nC Z\nC Y\nC Z\nA Y\nC Z\nC Z\nA X\nC X\nB X\nC X\nA X\nC Y\nC Z\nC Z\nC Z\nA Z\nC Y\nA X\nC X\nB X\nB X\nC Y\nC X\nA X\nC X\nC X\nA Y\nC Z\nA X\nA X\nA X\nC Z\nA X\nC Z\nC Y\nC Z\nC X\nA X\nC Z\nA X\nC Z\nC X\nC X\nA X\nC Z\nC Z\nC X\nA Y\nB X\nB Z\nA Z\nC Z\nA X\nA X\nA X\nC X\nC X\nC Y\nC Z\nA Y\nB Z\nA X\nC X\nC X\nC X\nC Y\nC X\nA X\nA X\nA Z\nA X\nA X\nC Z\nC Z\nC Z\nA X\nC X\nC X\nC Y\nA X\nC Z\nA Z\nC X\nA X\nC X\nC Z\nA X\nA X\nC Z\nC X\nC Y\nA X\nC Y\nC Z\nA Z\nC X\nA X\nA X\nA X\nA Z\nC X\nC X\nA X\nA X\nB X\nC Y\nC X\nC Z\nC Y\nA X\nC X\nC Z\nC Y\nC Y\nC X\nC Y\nB X\nC X\nC Y\nA X\nC Z\nC Y\nA X\nA X\nC X\nA X\nA X\nA Z\nC X\nA Z\nC X\nC X\nC X\nC Y\nA Z\nC Z\nA X\nB X\nC X\nA X\nA Z\nC X\nC Z\nB X\nC X\nA X\nA Y\nA Z\nC Z\nC Z\nC X\nA Z\nC Z\nC Z\nC X\nC Y\nC Z\nC Z\nC X\nA Z\nC Z\nC X\nA X\nA X\nA X\nA Z\nA Z\nC Z\nA X\nC X\nA X\nC X\nC Z\nC X\nC X\nA X\nC X\nB Y\nA X\nB X\nA X\nC X\nC Z\nA X\nC X\nA X\nA X\nC Z\nC X\nC X\nC X\nC Z\nA X\nB X\nA Z\nC X\nB Z\nC Z\nB Z\nC Z\nA Y\nA X\nB Y\nA X\nA X\nC Z\nC X\nA X\nB X\nC X\nB Z\nC Z\nA X\nA X\nA X\nA X\nA X\nA X\nA X\nC Y\nA Y\nC X\nC Z\nC X\nC Y\nC Z\nC X\nA X\nC Z\nA X\nA Z\nC X\nC Z\nC Y\nA X\nC X\nC Z\nA X\nA Y\nC X\nA X\nC Y\nA Y\nC Y\nA Z\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nA Z\nC X\nC Z\nB X\nC X\nA X\nA Y\nA X\nC Z\nA Y\nA Y\nC X\nB Z\nC X\nA X\nA X\nA X\nA X\nA X\nC X\nC Z\nA Z\nA X\nC Y\nC Z\nA X\nA Z\nB Z\nA Z\nA X\nC Y\nC X\nC X\nC X\nB Z\nA X\nC Y\nA X\nA X\nA X\nC Y\nA X\nB X\nC X\nC X\nC Z\nC Z\nA X\nC Y\nA Z\nA X\nC X\nA X\nC X\nC X\nC Z\nA X\nC Y\nC Y\nA X\nA Z\nA Z\nA X\nC X\nA X\nC Y\nB X\nA X\nC Y\nC X\nB X\nC Z\nA X\nA X\nC X\nC Z\nC Z\nC X\nC Y\nC Y\nA X\nC Z\nC X\nC Y\nC X\nA X\nA X\nA X\nB Y\nC X\nA X\nC X\nC X\nA X\nC Z\nC Z\nC X\nB X\nA Y\nA Y\nC Z\nC Y\nC X\nC Y\nB Y\nA Z\nC X\nA X\nA Z\nA Y\nC X\nA Z\nC Z\nC Y\nC Z\nA X\nC X\nC Z\nC X\nC X\nA X\nC Z\nA Z\nC X\nC Y\nC X\nA X\nA Z\nC Z\nC X\nA Z\nB Z\nC Y\nB X\nA Y\nB X\nB Y\nA Y\nA X\nA Z\nC X\nC X\nA X\nC X\nC Z\nC Y\nA Z\nA X\nC Z\nA X\nA X\nA Z\nA X\nA X\nC Z\nA X\nC X\nA X\nA X\nA Y\nC Z\nA X\nC Z\nA Z\nA X\nA X\nA Y\nC Z\nA Z\nA Z\nA X\nC X\nA X\nA X\nC Z\nC X\nC X\nC X\nC Y\nC X\nA X\nB X\nB X\nC Z\nC Z\nC Z\nC X\nB Y\nA Y\nB X\nB X\nC X\nC X\nC X\nA X\nC Y\nA Z\nA X\nC X\nA X\nA X\nA X\nB X\nC Y\nA X\nC Z\nA X\nC X\nA X\nC Z\nC X\nA X\nA Z\nA X\nA X\nA X\nC Z\nA Y\nB X\nA X\nB X\nC Z\nA X\nA X\nC Y\nC Z\nC Z\nA X\nC X\nA X\nA X\nA X\nA X\nA X\nC X\nA X\nC Y\nC X\nB X\nA X\nC Y\nC Z\nA X\nA X\nC X\nA Z\nA X\nA Z\nA X\nC Z\nA X\nB X\nC X\nA X\nC X\nA X\nC Y\nC Z\nA X\nC Z\nC Z\nC X\nB X\nC Z\nA X\nA Z\nC X\nA X\nC X\nC Z\nC Z\nC Y\nC Z\nA X\nC X\nC Z\nA Z\nC Z\nA Z\nC X\nC Z\nA X\nA X\nB X\nA Z\nB X\nC Y\nC Z\nC X\nA X\nC Z\nC Z\nC Z\nB X\nC X\nC X\nA Z\nA X\nC Y\nA X\nB Z\nB X\nA X\nC Y\nB X\nC Z\nC Y\nC Z\nA X\nC Y\nA X\nA X\nA Z\nA X\nA X\nC X\nC Y\nC Z\nC Z\nC Y\nB Y\nC Z\nA X\nA X\nC X\nC X\nC X\nA X\nC Y\nA X\nA Y\nA X\nC X\nC Y\nC Y\nB X\nA X\nC Z\nA X\nC Z\nC X\nA X\nA Z\nC X\nC Y\nA X\nA Z\nA Z\nC Y\nA X\nC Z\nC Z\nA X\nA Z\nB X\nA X\nC Y\nC X\nB Z\nC Z\nA X\nC Y\nA X\nC Y\nA Z\nA X\nC X\nC Y\nB X\nA X\nB X\nA X\nA X\nB Y\nA X\nA X\nC X\nA X\nC X\nA X\nA X\nC Y\nA X\nC Z\nC Z\nA Z\nC X\nA Z\nC Y\nC Z\nC X\nA X\nC Z\nA X\nC Y\nA X\nA Z\nC Y\nC X\nC X\nC Z\nB X\nA X\nA X\nA Z\nC Z\nC X\nA X\nC X\nA Z\nA Z\nA X\nC X\nC Z\nB Z\nC X\nC X\nA X\nA X\nA X\nC Y\nC X\nA X\nC Z\nA X\nB Y\nA X\nA X\nC X\nB X\nA X\nC X\nB Y\nA Z\nC X\nC X\nA X\nA X\nA X\nC Y\nC X\nA Z\nC X\nA X\nC Z\nC Z\nC Y\nA X\nA X\nB Z\nC Y\nC Z\nA X\nC Z\nA X\nC Z\nB X\nA Z\nA Z\nC X\nA X\nC Z\nC X\nA X\nA X\nC X\nC Z\nC X\nA X\nC X\nA X\nA X\nC Z\nC X\nA X\nA X\nA X\nA X\nC Y\nA X\nC X\nC Z\nC Y\nC Z\nC X\nC Z\nA X\nC X\nC Z\nC Z\nC Z\nB X\nC X\nA Z\nA Z\nA X\nC X\nC Z\nB Z\nC Z\nC Z\nA Y\nA Y\nC X\nA X\nA X\nA Z\nA X\nA Y\nA Z\nA X\nA X\nC Z\nC Z\nA Y\nA X\nB X\nA X\nA X\nC X\nA X\nA Z\nC Z\nC X\nC Z\nC X\nA Z\nB X\nA X\nA X\nC X\nB Y\nA X\nC Z\nA X\nA Y\nA Z\nA X\nC Z\nA Z\nB X\nC Z\nC Y\nA X\nC Y\nA X\nC X\nC X\nC X\nA X\nC X\nC Z\nC Y\nA Z\nC X\nC Y\nA X\nA X\nC Z\nA X\nC X\nC X\nA X\nA X\nA Z\nC X\nC Z\nA Z\nA Z\nA X\nB X\nB X\nA X\nC Z\nA Z\nC Z\nC X\nC Z\nB X\nC X\nC X\nB Z\nA X\nA Z\nB Z\nB Z\nC X\nA Z\nA X\nA Y\nC X\nA X\nC Z\nA X\nC X\nA X\nC Z\nC X\nC X\nC X\nC Z\nB Z\nA X\nA X\nA X\nC Z\nA X\nA X\nC X\nB Z\nC X\nC X\nA X\nB Y\nC X\nC X\nC X\nA X\nC X\nA Z\nC Y\nB Z\nA X\nC Z\nC Z\nC Z\nC Z\nA Y\nC Z\nA X\nA X\nC X\nC X\nA X\nC X\nA Z\nA X\nC Z\nC X\nA X\nC Z\nC X\nC Z\nB Z\nA X\nC Y\nC Z\nA X\nA X\nC Y\nA Z\nC X\nC Z\nC Z\nC Y\nC Z\nA X\nC X\nA X\nA X\nC X\nA X\nC Z\nA X\nA Z\nA X\nC Z\nC Z\nB X\nC Z\nA Y\nA Z\nA X\nC Y\nC X\nC Y\nA X\nA Z\nA X\nA X\nA X\nC X\nB X\nC X\nA Y\nA Y\nC Z\nA X\nA X\nA Z\nC X\nA X\nA Z\nC Z\nC Z\nC X\nC X\nA X\nA X\nC Z\nA X\nC Z\nC Z\nB Z\nA X\nA X\nC Z\nA X\nC Z\nC Y\nC X\nA X\nA Z\nA X\nA X\nA X\nC Y\nC Z\nA X\nC Y\nC Z\nC Z\nA X\nA Z\nA X\nC Z\nC Y\nC Z\nC Y\nA X\nC X\nA X\nA X\nA X\nC X\nA X\nA X\nC Y\nC X\nA X\nC X\nA Z\nA X\nC Z\nC X\nB Z\nC Z\nA X\nC Y\nC Z\nC X\nA X\nA X\nB Y\nA X\nB X\nC X\nA X\nA X\nC X\nC Y\nA X\nA X\nA X\nC X\nC Z\nA X\nB X\nC Y\nC Y\nA X\nC Y\nC X\nA X\nC X\nA X\nA X\nA X\nC X\nC X\nB Z\nA X\nC X\nA X\nC Z\nA X\nC Y\nA X\nC Z\nC Z\nC Y\nA X\nA Z\nA X\nC X\nC Z\nA X\nC Z\nC X\nC Z\nA X\nC Y\nA X\nC Z\nC Y\nC X\nA X\nA Y\nB X\nA X\nA Y\nA X\nA X\nA X\nA X\nC Z\nC Y\nB X\nA X\nC X\nA X\nC X\nA X\nA Y\nA X\nC Z\nA Z\nC X\nA X\nA X\nA X\nC Z\nC Z\nC Y\nC X\nA X\nC X\nC Y\nA Z\nC X\nA X\nC Y\nC Z\nC Z\nA X\nA X\nC Z\nC Z\nC X\nC X\nC X\nC Z\nC Y\nC X\nB Z\nC Z\nA X\nC Z\nA X\nA X\nC X\nC X\nC Y\nA Y\nA X\nC X\nA X\nC X\nC X\nA X\nA X\nA Y\nC Z\nC Y\nA X\nA X\nA X\nA X\nC X\nC Y\nA X\nA Y\nA X\nA X\nC X\nA Z\nC Z\nC Z\nC Z\nC Z\nA X\nC Z\nC X\nC X\nB X\nC X\nC Z\nC X\nA Z\nC Z\nB X\nB Z\nC Y\nA X\nB X\nA X\nA X\nA X\nC X\nC X\nA X\nC Y\nA X\nC Y\nB Y\nC Y\nA X\nC X\nC Y\nC Z\nC X\nA X\nA X\nC X\nB X\nC Z\nC X\nA X\nA Z\nA X\nC Z\nC X\nB X\nA Z\nA X\nB Z\nC Z\nA X\nC Y\nA X\nC Z\nB X\nC X\nC X\nC Y\nA X\nA X\nA X\nC Z\nC X\nB Z\nC Z\nB X\nB Z\nA X\nA Z\nA X\nC X\nC X\nC Z\nC X\nC X\nB Y\nA X\nA X\nA X\nA X\nA X\nA X\nC X\nA Z\nA Z\nC X\nC X\nA X\nB Y\nC X\nC X\nA Z\nA X\nB X\nA X\nC X\nC Z\nC Y\nC Z\nC Z\nB X\nC Y\nC X\nA X\nA X\nC X\nC Y\nC Z\nA X\nC X\nA X\nB Z\nA X\nC Y\nC X\nC X\nA X\nC Z\nC Z\nA X\nC X\nC X\nC X\nA X\nA Z\nC X\nA X\nC Z\nA X\nC Z\nC Z\nA X\nC Z\nA Z\nC X\nA X\nA X\nC Z\nA X\nA X\nA X\nC X\nA X\nA X\nC Z\nC X\nC Y\nB X\nC X\nC Y\nC X\nA X\nA Y\nA X\nA X\nA Z\nC Z\nA X\nC X\nC X\nC X\nC X\nB Z\nA X\nB Y\nC X\nC X\nC Y\nC X\nC Z\nC Z\nA X\nC X\nA X\nC X\nA Z\nC Y\nB X\nA X\nC X\nC Z\nC Y\nB X\nC Y\nA X\nC X\nA X\nA X\nA Z\nA X\nB X\nC X\nA X\nA Y\nA X\nC X\nC Z\nA Z\nA X\nA X\nC Z\nA X\nC X\nA X\nC X\nA X\nC Z\nC Y\nA X\nC X\nA X\nC Z\nA Y\nB X\nC Z\nC Z\nA X\nA X\nA Y\nA Z\nA X\nC X\nC Y\nC Z\nA X\nC Z\nC Z\nB X\nA X\nA X\nA X\nC Y\nA Z\nC Z\nC Z\nA Z\nA X\nA X\nB X\nC X\nB X\nA X\nC Z\nA Y\nC Z\nA X\nC X\nC Z\nC X\nA X\nC X\nA X\nA X\nC Z\nA Z\nC X\nC X\nB Z\nC Z\nA Y\nA X\nC X\nC Z\nA X\nC Z\nC X\nC Y\nC X\nA Y\nC Z\nC Z\nA X\nA X\nA X\nC Z\nC Y\nC Z\nA X\nC Z\nA X\nC X\nA X\nA Y\nA X\nA Z\nA X\nA Y\nA X\nA X\nA X\nA Z\nA X\nC Z\nC Z\nC Z\nC X\nA X\nA Z\nC X\nC Z\nA X\nC X\nC Y\nA X\nC X\nA X\nC Y\nA X\nA X\nC Z\nC X\nA X\nC Z\nA X\nA X\nC Z\nC X\nC Z\nC Y\nA Y\nC Z\nC X\nB X\nA X\nA X\nA Z\nA X\nA X\nC X\nC Z\nA X\nC X\nA Z\nB X\nA Z\nC Z\nC Z\nA X\nB X\nA X\nA Y\nA X\nA X\nC Z\nA X\nC Y\nC Z\nC Y\nA X\nA X\nA X\nA X\nB Z\nB Z\nA X\nC X\nC X\nA X\nC X\nC Y\nB X\nC Y\nB X\nA X\nB Z\nC Z\nA X\nA X\nC X\nA Z\nA X\nC X\nC Z\nA X\nC X\nC X\nC X\nC Z\nC Y\nA X\nA X\nA X\nC Z\nC Z\nC X\nC Z\nB X\nA X\nC Z\nC Z\nC Y\nA X\nA X\nC Z\nA Z\nC X\nC Z\nC Y\nC Z\nC Z\nA X\nC Z\nC Y\nC X\nB X\nC Z\nA Y\nC Z\nC X\nC X\nA X\nA X\nA X\nC Z\nB Z\nA X\nA Z\nB X\nA Z\nA Z\nC Z\nC Z\nC X\nC Y\nC Y\nC Z\nA Z\nC Y\nC X\nC Y\nA Z\nB Y\nA X\nC Y\nA X\nA X\nA Z\nC Z\nC Z\nC Z\nC X\nC X\nC Z\nC Z\nA X\nC X\nA Y\nA Y\nA X\nB Z\nA X\nC X\nA X\nC X\nA X\nA X\nA X\nC X\nC Y\nC Z\nC Z\nA X\nC Z\nA X\nC X\nC X\nC Z\nA X\nA X\nA X\nC X\nC Z\nA X\nA X\nA X\nA X\nC Z\nB Y\nA X\nA X\nA X\nC Y\nA X\nA X\nA Z\nC X\nA Z\nC Z\nA Z\nC Z\nA X\nA Z\nA X\nA X\nA X\nA X\nA Y\nC X\nC Z\nA X\nA Z\nC X\nA Y\nC Z\nC Y\nA X\nB X\nA Y\nC X\nA X\nC Z\nC X\nA X\nC Z\nC X\nA X\nC X\nC X\nC Z\nA X\nA Y\nC Y\nC Y\nA X\nA X\nA X\nA X\nA X\nC X\nA Y\nC Z\nC Z\nC Y\nA X\nC Z\nC Z\nA X\nC X\nC X\nC Y\nA X\nA X\nC X\nC X\nA Z\nA X\nC Z\nA X\nC Z\nA X\nB X\nA Z\nB X\nC Z\nC Z\nC X\nA X\nA Z\nC X\nA X\nA X\nC X\nC Y\nC Z\nC X\nC X\nA X\nC Z\nC Z\nC X\nB X\nC Z\nA X\nB X\nA Z\nC X\nA Z\nA X\nA X\nC X\nA X\nC Z\nA X\nA X\nC Z\nC Z\nC Z\nA X\nC X\nA Y\nC Y\nA X\nA X\nA X\nA X\nC X\nC Z\nA X\nA X\nA X\nC X\nC Z\nA X\nC Z\nA X\nA Y\nC Y\nC X\nC X\nA X\nA X\nA X\nA Z\nA X\nC Z\nA X\nC Y\nB Z\nB X\nA X\nC X\nC Z\nA X\nA X\nC Z\nB X\nB X\nC X\nC Y\nC X\nB X\nA X\nA X\nC X\nA Z\nA X\nC X\nC X\nC X\nA X\nC Z\nA Y\nA X\nC Y\nA X\nA X\nC Z\nA Z\nA Z\nC X\nC X\nC Y\nC Y\nC X\nC X\nC Z\nA X\nC X\nA X\nA X\nA X\nA X\nC Y\nC Z\nA X\nC Z\nC X\nC X\nA X\nA X\nA Z\nC Y\nC X\nA X\nC X\nA X\nA Z\nA X\nA Z\nA X\nA X\nA X\nC X\nA Z\nA X\nC X\nC Y\nA Z\nA X\nB X\nC X\nC Y\nC Z\nC X\nC Y\nC X\nC X\nA X\nC Y\nB X\nA Z\nC Z\nB Z\nC X\nA X\nC Z\nA X\nC X\nA X\nA X\nA X\nC Z\nC Y\nB Z\nA X\nC X\nA Y\nC Z\nA X\nA X\nA Z\nA Z\nA Y\nC X\nC Z\nC X\nA Z\nC X\nC Z\nC X\nB X\nA X\nC Z\nA X\nA X\nC Z\nA Z\nC X\nC Y\nC X\nC X\nC Y\nA X\nA X\nC X\nA Z\nC X\nC Z\nC X\nA Z\nA X\nA Y\nA X\nA X\nB Z\nC Z\nC Z\nA Y\nC X\nA X\nB X\nA X\nA Z\nC Y\nC Z\nC X\nC Z\nC Z\nC X\nC X\nA X\nC X\nA Z\nC Z\nC Z\nC Z\nC Y\nC X\nA X\nC Z\nA Z\nC Z\nC Z\nA X\nC X\nA X\nC Z\nA X\nB X\nA X\nC Z\nC X\nC X\nA X\nC Y\nA X\nC Z\nB X\nC Z\nC X\nA X\nC X\nC X\nC Z\nA X\nA X\nC Z\nC Z\nC X\nC Z\nC X\nA X\nA X\nC Z\nC X\nC X\nA X\nC Z\nA Z\nC Z\nB X\nC X\nC Y\nC X\nC Z\nA X\nB X\nC Z\nA X\nC Z\nA Z\nC Z\nC X\nA X\nC Z\nC Z\nA X\nA X\nC Z\nA X\nC Y\nA Z\nC X\nC Z\nA X\nB Z\nB X\nA X\nA Z\nA X\nA Z\nA X\nA X\nC Y\nA X\nC Y\nC X\nC Y\nC Y\nC X\nA X\nA Z\nA Z\nC X\nC Z\nB X\nA X\nC Z\nA Z\nC X\nC Z\nC Y\nA X\nA X\nC Z\nC Z\nC Y\nA Z\nC Z\nC Y\nA X\nC X\nA X\nC X\nC Z\nA Z\nB Z\nA X\nA X\nA X\nC X\nC X\nA Y\nA Z\nC X\nC Z\nA X\nB X\nA X\nA X\nC X\nC X\nB X\nA X\nB X\nC Z\nA Z\nC Z\nA X\nC X\nC Z\nC Y\nA Y\nA Z\nC Y\nC Z\nA X\nA X\nC X\nA X\nC Z\nC Y\nA X\nC Z\nA X\nA X\nB X\nA X\nA Z\nC X\nC Y\nA Z\nC Z\nA X\nA Z\nC X\nC Z\nC X\nC Z\nA X\nA X\nA X\nC X\nA X\nC Z\nC X\nC X\nC X\nC X\nA X\nC X\nB Y\nA Z\nA Z\nC Z\nC X\nA Y\nC X\nA X\nC X\nC Z\nB Z\nC Z\nB X\nA X\nA Z\nA X\nC X\nA X\nC Z\nC Z\nC Z\nA X\nC Z\nA X\nC Z\nC X\nC X\nC X\nB X\nA X\nA X\nB X\nC X\nA X\nC Z\nA Z\nC Y\nC Z\nA Z\nB Z\nA Z\nC Z\nC Z\nC X\nA X\nA X\nC X\nC X\nC Y\nA Y\nA Z\nA X\nC Z\nC Z\nC Y\nC X\nA X\nA X\nC Y\nA Z\nC X\nC X\nC X\nA X\nC X\nC X\nA Z\nC X\nC Y\nA Z\nC Z\nC Y\nA Z\nC Z\nA X\nC X\nC Y\nC X\nC X\nC Z\nC X\nC X\nC Z\nC X\nA X\nB Y\nA X\nC X\nB Z\nC Z\nC X\nC Z\nC Z\nA Y\nA Y\nA X\nA Z\nC Z\nA X\nC X\nC Z\nA Z\nA X\nA X\nA X\nB X\nA X\nB Z\nC X\nA X\nC X\nA Z\nC X\nA X\nC Y\nA X\nC X\nC Y\nA Z\nC Z\nC Z\nB X\nA X\nC X\nA X\nC X\nC Y\nA X\nC Y\nA X\nB X\nC Y\nA X\nA X\nC X\nA X\nB Y\nC Y\nC Y\nC Y\nC X\nA Y\nC X\nC Z\nA X\nA Z\nA X\nA X\nC Z\nA Z\nA Z\nC X\nA X\nA X\nB X\nC X\nC Y\nC X\nB Z\nA X\nC X\nC Y\nC X\nC Z\nC Y\nA X\nC X\nA X\nA X\nA Y\nC Z\nC Z\nC Z\nA X\nA X\nA Z\nA X\nA X\nA Z\nA X\nC Y\nC Y\nA X\nA X\nA Z\nC X\nA X\nC Z\nA Z\nC Z\nC Y\nC Z\nA X\nC Z\nC X\nC Z\nA X\nC Y\nC Y\nB X\nA X\nA Z\nC X\nA X\nA X\nC Z\nA X\nC X\nC Z\nA Z\nA Y\nA Y\nA X\nC X\nA Y\nA X\nA X\nB Z\nA X\nC X\nC X\nC X\nA X\nC X\nC Z\nC Z\nA Z\nC X\nC X\nC Y\nA X\nC X\nA X\nA X\nC Y\nC X\nA X\nC Y\nC X\nC X\nA Y\nC Z\nC X\nC X\nC Y\nC Z\nA Y\nA X\nC Z\nC Z\nC Z\nC X\nC Z\nA X\nA X\nA Z\nA X\nC Y\nC X\nC Z\nA X\nA X\nC Z\nA X\nC X\nA X\nA Y\nC X"

  def main(args: Array[String]): Unit = {

    val strategyGuideRaw: List[(Char, Char)] = input.split("\n").map(line => (line(0), line(2))).toList
    val strategyGuide: List[(Choice, Choice)] = strategyGuideRaw
      .map(pair => (convert(pair._1), convert(pair._2)))
      .map(pair => (pair._2, pair._1))

    def convert(input: Char): Choice = {
      input match {
        case 'A' => Rock
        case 'B' => Paper
        case 'C' => Scissors
        case 'X' => Rock
        case 'Y' => Paper
        case 'Z' => Scissors
      }

    def play(c1: Choice, c2: Choice): Int = {
      c1.beats(c2) match {
        case Win => 6 + c1.value
        case Draw => 3 + c1.value
        case Loss => 0 + c1.value
      }
    }

    val totalScore: Int = strategyGuide.map(pair => play(pair._1, pair._2)).sum
    println(totalScore)
  }




  }
}


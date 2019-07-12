import scala.io.StdIn

object Application extends App {

  val travelledDays = StdIn.readLine("Enter Number of days travelled:  \n")

  val mileage = 0.25 * 46
  val tyneTunnel = 1.80 * 2
  val fourLaneEnds = 0.9

  def calculateMileage(days: String): String = {

    f"Days travelled: $days.\n \nMileage @ (0.25p per mile x 46 miles) = £$mileage%1.2f. " +
      f" \n£$mileage%1.2f x $days days = £${mileage * days.toInt}%1.2f\n"
      }

  def calculateTolls(days: String): String = {

    f"Tyne Tunnel @ (£1.80 x 2) per day. \n£$tyneTunnel%1.2f * $days days = £${tyneTunnel * days.toInt}%1.2f\n"
  }

  def calculateParking(days: String): String = {
    f"Parking @ ($fourLaneEnds%1.2f per day). \n£$fourLaneEnds%1.2f x $days = £${fourLaneEnds * days.toInt}%1.2f\n"
  }

    def calculateExpenses(days : String, sum : Int => String) : String = {
      sum(days.toInt)
    }

  println(calculateMileage(travelledDays))
  println(calculateTolls(travelledDays))
  println(calculateParking(travelledDays))
  println(calculateExpenses(travelledDays, days => {
    f"Total expenses for $days days. = £${(mileage + tyneTunnel + fourLaneEnds) * days}%1.2f"
  }))
}
import scala.util.matching.Regex

object TestRe {
  def main(args: Array[String]) {
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"
    println("safds",pattern findFirstIn str)
    val pattern1 = "Scala".r
    val str1 = "Scala is Scalable and cool"

    println("safds",pattern1 findFirstIn str1)
    val pattern2 = "WScala".r
    val str2= "Scala is Scalable and cool"

    println("safds",pattern2 findFirstIn str2)

    println("safds",pattern1 findFirstIn str1)
    val pattern3 = "Scala".r
    val str3= "Scala"

    println("3333333333333333333",pattern3 findFirstIn str3)
  }
}
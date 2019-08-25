import scala.io.Source

object TestFromFile {
  def main(args: Array[String]) {
    println("文件内容为:" )

    Source.fromFile("e:\\scalacode\\1.txt" ).foreach{
      print
    }
  }
}

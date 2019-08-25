import java.io._

object FileTest {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("菜鸟教程")
    writer.close()
  }
}
/**
  * description:
  * date 2017/12/28
  *
  * @author lining1
  * @version 1.0.0
  */

import scala.io.Source

object TFile {

  def main(args: Array[String]) {
    println("文件内容为:" )

    Source.fromFile("D:\\IoTJoker\\HelloWorld\\src\\main\\scala\\test.txt" ).foreach{
      print
    }
  }

}

/**
  * description:
  * date 2017/12/28
  *
  * @author lining1
  * @version 1.0.0
  */
object TMatch {

  def main(args: Array[String]) {
    println(matchTest(3))

  }
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

}

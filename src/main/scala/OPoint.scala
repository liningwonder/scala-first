/**
  * description:
  * date 2017/12/28
  *
  * @author lining1
  * @version 1.0.0
  */
object OPoint {

  def main(args: Array[String]) {
    val pt = new Point(10, 20);
    val loc = new Location(10, 20, 15);
    val p3 = new TPoint(3, 3)

    // 移到一个新的位置
    pt.move(10, 10);
    loc.move(10, 10, 5)
    println(p3.isNotEqual(2))
  }
}

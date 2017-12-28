/**
  * description:
  * date 2017/12/28
  *
  * @author lining1
  * @version 1.0.0
  */
class TPoint(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

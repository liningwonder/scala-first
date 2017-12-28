/**
  * description:
  * date 2017/12/28
  *
  * @author lining1
  * @version 1.0.0
  */
object Add {

  var factor = 3
  val multiplier = (i:Int) => i * factor
  val greeting: String = "Hello,World!"
  var myList = Array(1.9, 2.9, 3.4, 3.5)
  val x = List(1,2,3,4)
  var y = Set(1,3,5,7)
  val z = Map("one" -> 1, "two" -> 2, "three" -> 3)
  val h = (10, "Runoob")



  def printMe(s: String ) : Unit = {
    println(s)
  }

  def printMe(s: Array[Double] ) : Unit = {
    println(s.length)
  }

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]) {
    printMe(greeting)
    printMe(myList)
    println( "Returned Value : " + addInt(5,7) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }
}

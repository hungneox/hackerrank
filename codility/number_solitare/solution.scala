import scala.collection.JavaConverters._

import scala.collection.mutable.Map;
import scala.collection.mutable.ArrayBuffer

object Solution {
  var memo:Map[Int, Long] = Map()
  
  def dp(a: Array[Int], l: Int) : Int = {
    if (l == a.length -1) {
        return a(l)
    }
    var dice = new ArrayBuffer[Long]()
    if (memo.keySet.exists(_ == l)){
        return memo(l).intValue
    }
    
    for (i <-1 to 6) {
        if (a.length > l+i) {
            dice += a(l) + dp(a, l+i)
        }
    }
    memo(l) = dice.max.intValue
    return dice.max.intValue
  }
  
  def solution(a: Array[Int]): Int = {
    return dp(a, 0)
  }
}

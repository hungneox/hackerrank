import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(a: Array[Int]): Int = {
    if (a.length == 0) {
        return -1
    }
    var total = BigInt(0)
    total = a.reduce(_+_)
    
    var leftSum = BigInt(0)
    var rightSum = BigInt(0)
    
    for(i <- 0 to a.length-1) {
        rightSum = total - leftSum - a(i)
        if (leftSum == rightSum) {
            return i
        }
        leftSum += a(i)
    }
    return -1
  }
}
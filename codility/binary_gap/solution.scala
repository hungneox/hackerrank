import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer
// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    val binaryString = n.toBinaryString
    var maxLengths = new ArrayBuffer[Int]()
    var maxLength = 0
    for (i <- 0 to binaryString.length -1) {
        if (binaryString(i) == '0'){
            maxLength += 1
        } else {
            maxLengths+= maxLength
            maxLength = 0
        }
    }
    return maxLengths.max
  }
}
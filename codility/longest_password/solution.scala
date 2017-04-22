import scala.collection.JavaConverters._

object Solution {
  def solution(s: String): Int = {
    // write your code in Scala 2.12
    var words = s.split(" ")
    var maxLength = 0
    for (i <- 0 to words.length-1) {
        var digits = for (w <- words(i) if w.isDigit) yield w
        var letters = for (w <- words(i) if w.isLetter) yield w
        var length = digits.length + letters.length
        maxLength = Math.max(length, maxLength)
    }
    return maxLength
  }
}
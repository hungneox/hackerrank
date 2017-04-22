import scala.collection.JavaConverters._

// it has to contain only alphanumerical characters (a-z, A-Z, 0-9);
// there should be an even number of letters;
// there should be an odd number of digits.
// for (i <- List.range(1, 10) if i % 2 == 0) yield i

object Solution {
  def solution(s: String): Int = {
    // write your code in Scala 2.12
    var words = s.split(" ")
    var maxLength = 0
    for (i <- 0 to words.length-1) {
        var digits = for (w <- words(i) if w.isDigit) yield w
        var letters = for (w <- words(i) if w.isLetter) yield w
        var length = digits.length + letters.length
        if (length == words(i).length){
            if(digits.length % 2 ==1 && letters.length % 2 == 0){
                maxLength = Math.max(length, maxLength)
            }
        }   
    }
    return if (maxLength > 0) maxLength else -1
  }
}
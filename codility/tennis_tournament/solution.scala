import scala.collection.JavaConverters._

object Solution {
  def solution(p: Int, c: Int): Int = {

    if (p >= c*2) {
        return c
    }
    return ((p - (p%2)) /2)
  }
}

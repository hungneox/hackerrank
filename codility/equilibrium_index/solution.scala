import scala.collection.JavaConverters._

object Solution {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    if (a.length == 0) {
        return -1
    }
    var total = BigInt(0)
    for (i <- 0 to a.length-1) {
        total += BigInt(a(i))
    }
    var rightSum = BigInt(0)
    var leftSum = BigInt(0)
    
    for (j <- 0 to a.length-1) {
       rightSum = total - leftSum - a(j)
       if (rightSum == leftSum) {
           return j
       }
       leftSum += a(j)
    }
    return -1
  }
}

// object Solution {
//   def solution(a: Array[Int]): Int = {
//     if (a.length == 0) {
//         return -1
//     }
//     var total = BigInt(0)
//     total = a.reduce(_+_)
    
//     var leftSum = BigInt(0)
//     var rightSum = BigInt(0)
    
//     for(i <- 0 to a.length-1) {
//         rightSum = total - leftSum - a(i)
//         if (leftSum == rightSum) {
//             return i
//         }
//         leftSum += a(i)
//     }
//     return -1
//   }
// }
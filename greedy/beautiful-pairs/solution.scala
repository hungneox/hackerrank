import scala.collection.mutable.Map;

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner(System.in);
        var n = sc.nextInt();

        var freq: Map[String, Int] = Map()

        for(a <- 0 to n - 1) {
            var current = sc.nextInt();
            if (!freq.keySet.exists(_ == current.toString)){
                freq += (current.toString -> 1)
            } 
            else {
                freq(current.toString) = freq(current.toString) + 1
            }
        }

        var pairs = 0;

        for(b <- 0 to n - 1) {
            var current = sc.nextInt();
            if (freq.keySet.exists(_ == current.toString) && freq(current.toString) > 0){
                freq(current.toString) = freq(current.toString) - 1
                pairs += 1
            } 
        }

        if (pairs == n) {
            pairs -=1
        } else {
            pairs += 1
        }

        println(pairs)
    }
}


// object Solution {

//     def main(args: Array[String]) {
//         val sc = new java.util.Scanner (System.in);
//         var n = sc.nextInt();
//         val arrayA = scala.io.StdIn.readLine().split(",").map(_.toInt)
//         val arrayB = scala.io.StdIn.readLine().split(",").map(_.toInt)
//     }
// }

// var bucketA = new Array[Int](n);
// var bucketB = new Array[Int](n);

// val arrayA = scala.io.StdIn.readLine().split(' ').map(_.toInt)
// val arrayB = scala.io.StdIn.readLine().split(' ').map(_.toInt)

//         println(
//           calories.sortBy(-_).foldLeft((BigInt("0"), 0))((x, y) =>
//             (x._1 + BigInt(y.toString)*BigInt("2").pow(x._2), x._2.toInt + 1)
//           )._1
//         )
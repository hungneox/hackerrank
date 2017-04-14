// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner(System.in);
        var n = sc.nextInt();
        var xs = new Array[Int](n);
        for(x_i <- 0 to n-1) {
           xs(x_i) = sc.nextInt();
        }

        xs = xs.sorted

        var minDiff = (xs(0) - xs(1)).abs

        for (i <- 2 to n-1) {
            minDiff = math.min(minDiff, (xs(i) - xs(i-1)).abs)
        }
        
        println(minDiff)    
    }

}
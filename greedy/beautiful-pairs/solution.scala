object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner(System.in);
        var n = sc.nextInt();
        var mapA = new Map[Int, Int];
        var mapB = new Map[Int, Int];
        
        // val arrayA = scala.io.StdIn.readLine().split(' ').map(_.toInt)
        // val arrayB = scala.io.StdIn.readLine().split(' ').map(_.toInt)

        for(ai <- 0 to n-1) {
            mapA(ai) = sc.nextInt();
        }

        for(bi <- 0 to n-1) {
            arrayB(bi) = sc.nextInt();
        }
        arrayA.foreach { println }
    }
}
// https://www.hackerrank.com/challenges/maximum-perimeter-triangle

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var sticks = new Array[Int](n);

        for(stickIndex <- 0 to n-1) {
           sticks(stickIndex) = sc.nextInt();
        }

        var count = 0;
        var maxPerimeter = 0
        var maxCombination = new Array[Int](3)

        sticks = sticks.sorted
        for(si <- 2 to n-1) {
            val a = sticks(si);
            val b = sticks(si-1);
            val c = sticks(si-2);

            if (a+b>c && a+c>b && c+b>a) {
                maxPerimeter = math.max(maxPerimeter, a+b+c);
                maxCombination(2) = a;
                maxCombination(1) = b;
                maxCombination(0) = c;
                count += 1;
            }
        }

        if (count==0){
            println("-1")
        } else {
            println(maxCombination.mkString(" "))
        }
    }
}
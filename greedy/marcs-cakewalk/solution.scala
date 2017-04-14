// https://www.hackerrank.com/challenges/marcs-cakewalk
object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var calories = new Array[Int](n);
        for(cIndex <- 0 to n-1) {
           calories(cIndex) = sc.nextInt();
        }

        calories = calories.sortBy(-_)
        
        var numMiles = BigInt("0")

        for(cIndex <- 0 to n-1) {
            numMiles += (BigInt(calories(cIndex).toString) * BigInt("2").pow(cIndex))
        }

        println(numMiles)
    }
}
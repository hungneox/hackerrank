object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var score = new Array[Int](n);
        
        for(score_i <- 0 to n-1) {
           score(score_i) = sc.nextInt();
        }
         // your code goes here
        var highest = score(0);
        var lowest = score(0);
        var highest_count = 0;
        var lowest_count = 0;
        for (i <-1 to n-1) {
            if (score(i) > highest) {
                highest = score(i);
                highest_count+=1;
            }
            if (score(i) < lowest) {
                lowest = score(i);
                lowest_count+=1;
            }
        }
       println(s"$highest_count $lowest_count")
    }
}

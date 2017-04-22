object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var data = new Array[BigInt](5);
        var memo = new Array[BigInt](5);
        var n = 5
        for (x <- 0 to n-1){
           data(x) = BigInt(sc.next())
        }
        var total = data.sum
        for (x <- 0 to n-1) {
            memo(x) = total - data(x)
        }
        
        println(s"${memo.min} ${memo.max}")
    }
}
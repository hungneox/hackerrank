import scala.io.StdIn.{readLine,readInt}

object Solution {
    def makeChange(coins: Array[Int], money: Int, index: Int, memo: Map[String, Int]) : Int = {
        if (money == 0) return 1
        if (index >= coins.length) return 0

        val key = money.toString + '-' + index.toString
        if (memo.contains(key)) {
            return memo.getOrElse(key, 0)
        }
        var amountWithCoins = 0
        var ways = 0
        while (amountWithCoins <= money) {
            val remaining = money - amountWithCoins
            ways = ways +  this.makeChange(coins, remaining, index+1, memo)
            amountWithCoins = amountWithCoins + coins(index)
        }
        memo.updated(key, ways)
        return ways
    }
    
    def main(args: Array[String]) {
        /* Enter your code here. 
        Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution
        */
        val first = readLine.split(' ').map(_.toInt)
        val money = first(0)
        val M = first(1)
        val coins = readLine.split(" ").map(_.toInt)
        val memo = Map[String, Int]()
        var result = this.makeChange(coins, money, 0, memo)
        println(result)
        // println(coins.deep.mkString("\n"))
  }
}
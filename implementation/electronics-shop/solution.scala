object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.nextInt();
        var n = sc.nextInt();
        var m = sc.nextInt();
        var keyboards = new Array[Int](n);
        for(keyboards_i <- 0 to n-1) {
           keyboards(keyboards_i) = sc.nextInt();
        }
        var drives = new Array[Int](m);
        for(drives_i <- 0 to m-1) {
           drives(drives_i) = sc.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        var max_combination = 0;
        keyboards = keyboards.sortWith(_>_)
        drives = drives.sortWith(_>_)
        for(k_i <- 0 to n-1) {
            var keyboard = keyboards(k_i)
            var drive = s - keyboard
            var available = drives.filter(_<= drive)
            if (available.length >= 1 ) {
                var temp_max = available.max + keyboard
                if (temp_max <= s && temp_max > max_combination) {
                    max_combination = temp_max
                }
            } 
        }
        
        if(max_combination != 0) {
            println(max_combination)
        } else {
           println("-1")
        }
    }
}
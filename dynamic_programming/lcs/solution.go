package main

import (
	"fmt"
)

var x = [5]int{1, 2, 3, 4, 1}
var y = [6]int{3, 4, 1, 2, 1, 3}

func lcs(i int, j int) int {
	if i == 0 || j == 0 {
		return 0
	}

	if x[i] == y[j] {
		return lcs(i-1, j-1) + 1
	}

	temp1 := lcs(i-1, j)
	temp2 := lcs(i, j-1)

	if temp1 > temp2 {
		return temp1
	}
	return temp2
}

func main() {
	// reader := bufio.NewReader(os.Stdin)
	// cases, _ := reader.ReadString('\n')
	// input0, _ := reader.ReadString('\n')
	// input1, _ := reader.ReadString('\n')

	// fmt.Println(cases)
	// fmt.Println(input0)
	// fmt.Println(input1)
	fmt.Println("Longest common subsequence")
	fmt.Printf("%d", lcs)
}

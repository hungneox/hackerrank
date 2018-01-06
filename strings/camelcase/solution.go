package main

import (
	"fmt"
	"strings"
	"unicode"
)

func main() {
	var input string
	fmt.Scan(&input)
	input = strings.Title(input)
	sum := 0
	for _, c := range input {
		if c == unicode.ToUpper(c) {
			sum++
		}
	}
	fmt.Print(sum)
}

// package main
// import (
//     "fmt"
//     "unicode"
// )

// func main() {
//     var input string
//     fmt.Scan(&input)
//     runes := []rune(input)
//     input = string(unicode.ToUpper(runes[0])) + string(runes[1:])
//     sum := 0
//     for _, c := range input {
//         if c == unicode.ToUpper(c) {
//             sum++
//         }
//     }
//     fmt.Print(sum)
// }

package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"sort"
	"strconv"
	"strings"
)

/*
 * Complete the birthdayCakeCandles function below.
 */
func birthdayCakeCandles(n int, ar []int) int {

	count := 0
	/*
	 * Write your code here.
	 */
	sort.Sort(sort.Reverse(sort.IntSlice(ar)))

	max := ar[0]

	for i := range ar {
		if ar[i] == max {
			count = count + 1
		}
	}
	return count
}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	outputFile, err := os.Create(os.Getenv("OUTPUT_PATH"))
	checkError(err)

	defer outputFile.Close()

	writer := bufio.NewWriterSize(outputFile, 1024*1024)

	nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
	checkError(err)
	n := int(nTemp)

	arTemp := strings.Split(readLine(reader), " ")

	var ar []int

	for arItr := 0; arItr < int(n); arItr++ {
		arItemTemp, err := strconv.ParseInt(arTemp[arItr], 10, 64)
		checkError(err)
		arItem := int(arItemTemp)
		ar = append(ar, arItem)
	}

	result := birthdayCakeCandles(n, ar)

	fmt.Fprintf(writer, "%d\n", result)

	writer.Flush()
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}

package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

func kangaroo(ar []int) bool {
	if ar[0] <= ar[2] {
		if ar[1] < ar[3] {
			return false
		}
	}

	deltaX := ar[2] - ar[0]
	deltaV := ar[3] - ar[1]

	if deltaV == 0 {
		return false
	}

	if deltaX%deltaV == 0 {
		return true
	}

	return false
}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	n := 4

	arTemp := strings.Split(readLine(reader), " ")

	var ar []int

	for arItr := 0; arItr < n; arItr++ {
		arItemTemp, err := strconv.ParseInt(arTemp[arItr], 10, 64)
		checkError(err)
		arItem := int(arItemTemp)
		ar = append(ar, arItem)
	}

	result := "NO"

	if kangaroo(ar) {
		result = "YES"
	}

	outputFile, err := os.Create(os.Getenv("OUTPUT_PATH"))
	checkError(err)

	defer outputFile.Close()

	writer := bufio.NewWriterSize(outputFile, 1024*1024)
	fmt.Fprintf(writer, "%s\n", result)

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

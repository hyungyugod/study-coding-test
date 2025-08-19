package main

import (
	"strconv"
)

func solution(i, j, k int) int {
	if i > j {
		i, j = j, i 
	}
	if k < 0 || k > 9 {
		return 0 
	}
	total := 0
	for x := i; x <= j; x++ {
		total += countDigitInNumber(x, k)
	}
	return total
}

func countDigitInNumber(x, k int) int {
	target := byte('0' + k)
	s := strconv.Itoa(x)
	cnt := 0
	for i := 0; i < len(s); i++ {
		if s[i] == target {
			cnt++
		}
	}
	return cnt
}

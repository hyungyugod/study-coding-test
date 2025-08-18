package main

import (
	"math"
)

func solution(n int) int {
	if n < 4 {
		return 0
	}

	primes := 1 // 소수 2를 미리 카운트
	for i := 3; i <= n; i += 2 { // 홀수만 검사
		isPrime := true
		limit := int(math.Sqrt(float64(i)))
		for j := 2; j <= limit; j++ {
			if i%j == 0 {
				isPrime = false
				break
			}
		}
		if isPrime {
			primes++
		}
	}
	// 합성수 개수 = 전체 개수(n) - 소수 개수(primes) - 1(= 숫자 1)
	return n - primes - 1
}

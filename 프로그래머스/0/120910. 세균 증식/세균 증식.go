import (
    "math"
)
func solution(n int, t int) int {
    return int(math.Pow(2, float64(t))) * n
}
func solution(numer1 int, denom1 int, numer2 int, denom2 int) []int {
    answer := make([]int, 2)
        n3 := numer1 * denom2 + denom1 * numer2
        d3 := denom1 * denom2
        g := gcd(n3, d3)

        answer[0] = n3/g
        answer[1] = d3/g
        
        return answer
}

func gcd(a int, b int) int {
    if b == 0 {return a}

        return gcd(b, a % b)
    }
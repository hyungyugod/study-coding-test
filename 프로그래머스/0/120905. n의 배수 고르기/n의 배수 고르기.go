func solution(n int, numlist []int) []int {
    answer := []int{}
    for _, i := range numlist {
        if i % n == 0 {
            answer = append(answer, i)
        }
    }
    return answer
}
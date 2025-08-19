func solution(array []int, n int) int {
    answer := 0
    for _, i := range array{
        if (i == n){
            answer++
        }
    }
    return answer
}
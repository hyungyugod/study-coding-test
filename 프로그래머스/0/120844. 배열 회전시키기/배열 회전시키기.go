func solution(numbers []int, direction string) []int {
    answer := []int{}
    n := len(numbers)

    if direction == "right" {
        answer = append([]int{numbers[n-1]}, numbers[:n-1]...)
    } else {
        answer = append(numbers[1:], numbers[0])
    }
    return answer
}
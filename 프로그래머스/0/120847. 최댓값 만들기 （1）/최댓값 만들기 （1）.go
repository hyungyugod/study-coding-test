import "sort"
func solution(numbers []int) int {
    sort.Sort(sort.Reverse(sort.IntSlice(numbers)))
    return numbers[0] * numbers[1]
}
func solution(num_list []int) []int {
    start := 0
    end := len(num_list) - 1

    for start < end {
        tmp := num_list[start]
        num_list[start] = num_list[end]
        num_list[end] = tmp

        start++  
        end--
    }
    return num_list
}
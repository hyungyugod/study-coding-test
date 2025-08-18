func solution(n int) int {
    counter := 1
    i := 1

    for counter <= n {
        counter *= i
        i++
    }

    return i - 2
}
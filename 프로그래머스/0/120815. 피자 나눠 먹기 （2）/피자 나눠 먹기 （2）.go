func solution(n int) int {
    answer := 0
    
    for i := 1; i <= n; i++{
        if 6 * i % n == 0{
            answer = i
            break
        }
                            
    }
    return answer
}
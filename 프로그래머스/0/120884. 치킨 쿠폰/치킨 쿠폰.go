func solution(chicken int) int {
    var div = chicken
        var answer = 0

        for div >= 10{
        var mod = div % 10
        div = div/10
        answer += div
        div = div + mod

        }
        return answer
}
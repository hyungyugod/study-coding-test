func solution(hp int) int {
    var a = hp / 5
    var b = hp % 5
    var c = b / 3
    var d = b % 3
    return a + c + d
}
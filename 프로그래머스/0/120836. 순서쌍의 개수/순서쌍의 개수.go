import "math"

func solution(n int) int {
    answer := 0
    sq := int(math.Sqrt(float64(n))) // 제곱근을 int로 변환
    
    for i := 1; i <= sq; i++ {       // 1부터 시작
        if n%i == 0 {
            answer += 2              // i와 n/i 두 개 약수
        }
    }
    
    if sq*sq == n {                  // 제곱수인 경우 중복된 약수 제거
        answer--
    }
    
    return answer
}
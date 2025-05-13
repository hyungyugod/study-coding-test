function solution(n) {
    let answer = 0;
    for (let i = 0; i < Math.sqrt(n); i++){
        if (n % i ===0){
            answer += 1;
        }
    }
    answer *= 2;
    
    if (Math.sqrt(n) % 1 === 0) {
        answer++;
    }
    
    return answer;
}
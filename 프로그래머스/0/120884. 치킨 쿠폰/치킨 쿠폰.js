function solution(chicken) {
    let answer = 0;
    
    while (parseInt(chicken / 10) !== 0){
        div = parseInt(chicken / 10);
        mod = chicken % 10;
        answer += div;
        chicken = div + mod;
    }
    
    return answer;
}
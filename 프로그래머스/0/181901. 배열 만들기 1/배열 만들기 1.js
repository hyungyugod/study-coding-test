function solution(n, k) {
    var answer = [];
    for (let i = k; i < n + 1; i += k){
        answer.push(i);
    }
    return answer;
}
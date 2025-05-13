function solution(n) {
    return n - findPrimeCount (n) - 1;
}



function findPrimeCount (n) {
    let arr = Array(n+1).fill(0);
    let answer = 0;

    for (let i = 2; i <= n; i++){
        if (arr[i] === 0) {
            for (let j = i*i; j <= n; j += i){
                arr[j] = 1;
            }
            answer += 1;
        }
    }
    
    return answer;
}
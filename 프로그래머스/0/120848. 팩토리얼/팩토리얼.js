function solution(n) {
    let counter = 1;
    let i = 1;

    while (counter <= n) {
        counter *= i;
        i++;
    }

    return i - 2;
}
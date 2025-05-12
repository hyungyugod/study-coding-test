function solution(hp) {
    let a = hp % 5;
    let b = (hp-a) / 5;
    let c = a % 3
    let d = (a-c) / 3
    return b + d + c;
}
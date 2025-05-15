function solution(numbers, direction) {
    let nl = numbers.length - 1;
    if (direction === "right") return [numbers[nl], ...numbers.slice(0, nl)];
    else return [...numbers.slice(1, nl + 1), numbers[0]];
}
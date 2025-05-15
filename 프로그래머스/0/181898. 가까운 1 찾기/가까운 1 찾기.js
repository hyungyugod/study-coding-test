function solution(arr, idx) {
    let a = arr.slice(idx, arr.length);
    return a.includes(1) ? a.indexOf(1) + idx : -1;
}
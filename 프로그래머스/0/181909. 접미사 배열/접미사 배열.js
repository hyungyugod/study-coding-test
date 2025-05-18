function solution(my_string) {
    let answer = [];
    answer.push(my_string);
    while (my_string.length > 1) {
        my_string = my_string.slice(1, my_string.length);
        answer.push(my_string);
    }
    return answer.sort();
}
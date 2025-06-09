#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* arr[], size_t arr_len) {
    // 글자 수 + 1 만큼 메모리 할당 (널 문자 포함)
    char* answer = (char*)malloc(arr_len + 1);

    for (size_t i = 0; i < arr_len; i++) {
        answer[i] = arr[i][0]; // 각 문자열의 첫 글자 복사
    }
    answer[arr_len] = '\0'; // 문자열 끝에 널 문자 추가

    return answer;
}
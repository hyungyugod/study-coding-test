#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const char** solution(const char* my_string) {
    size_t len = strlen(my_string);
    if (len == 0) return NULL;                 // 방어적 처리(선택)

    const char** answer = malloc((len) * sizeof *answer); // 접미사 len개
    if (!answer) return NULL;

    for (size_t i = 0; i < len; i++) {
        answer[i] = &my_string[i];             // 시작 주소만 저장
    }

    const char* tmp;
    for (size_t i = 0; i < len - 1; i++) {
        for (size_t j = 0; j < len - 1 - i; j++) {
            if (strcmp(answer[j], answer[j + 1]) > 0) {
                tmp = answer[j];
                answer[j] = answer[j + 1];
                answer[j + 1] = tmp;
            }
        }
    }
    return answer;
}
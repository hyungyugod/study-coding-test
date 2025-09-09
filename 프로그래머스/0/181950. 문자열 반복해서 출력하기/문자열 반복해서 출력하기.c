#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define LEN_INPUT 11

int main(void) {
    char s1[LEN_INPUT];
    int a;

    scanf("%s %d", s1, &a);
    int len = strlen(s1); // 위치 주의 -> 먼저 입력받고 계산해야함

    char * answer = malloc(a * len + 1); // null 문자를 생각해야함.

    answer[0] = '\0'; // strcat을 사용하기 위해 문자열 초기화

    for (int i = 0; i < a; i++) {
        strcat(answer, s1);
    }

    printf("%s", answer);

    return 0;
}
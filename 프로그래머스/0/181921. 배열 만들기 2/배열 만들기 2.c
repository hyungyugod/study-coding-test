#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 함수 원형: 길이(returnSize) 인자 없이!
int* solution(int l, int r) {
    int* answer = NULL;
    int count = 0;

    for (int i = l; i <= r; i++) {
        int n = i;
        bool isTarget = true;

        // 각 자릿수 확인
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 5) {
                isTarget = false;
                break;
            }
            n /= 10;
        }

        if (isTarget) {
            int* temp = realloc(answer, (count + 1) * sizeof(int));
            if (temp == NULL) {
                free(answer);
                return NULL;
            }
            answer = temp;
            answer[count++] = i;
        }
    }

    // 조건 만족하는 수가 하나도 없으면 -1만 담기
    if (count == 0) {
        answer = malloc(sizeof(int));
        answer[0] = -1;
        // count = 1; // 보통 returnSize를 안 쓰니 따로 처리 필요 없음
    }
    // (배열 길이 정보는 문제 시스템이 알아서 체크)

    return answer;
}
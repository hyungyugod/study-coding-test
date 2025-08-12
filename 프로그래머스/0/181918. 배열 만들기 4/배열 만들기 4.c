#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len) {
    int * answer = malloc(arr_len * sizeof(int));
    int i = 0;
    int count = 0;

    while (i < arr_len) {
        while (count > 0 && answer[count - 1] >= arr[i]) {
            count--;
        }

        answer[count++] = arr[i++];
    }

    answer = realloc(answer, count * sizeof(int));

    return answer;
}
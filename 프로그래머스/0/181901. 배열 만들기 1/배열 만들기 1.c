#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n, int k) {
    int count = n / k;
    int* answer = malloc(count * sizeof(int));
    int j = 0;
    for (int i = k; i < n + 1; i += k) {
        answer[j] = i;
        j++;
    }
    return answer;
}
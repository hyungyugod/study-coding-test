#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(const char* intStrs[], size_t intStrs_len, int k, int s, int l) {
    int* answer = malloc(intStrs_len * sizeof(int));
    char* tmp = malloc((l+1) * sizeof(char));
    int acnt = 0;
    for (size_t i = 0; i < intStrs_len; i++) {
        
        int count = 0;
        
        for (size_t j = s; j < s + l; j++){
            tmp[count++] = intStrs[i][j];
        }
        tmp[l] = '\0';
        
        int candidate = atoi(tmp);
        
        if(candidate > k){
            answer[acnt++] = candidate;
        }
        
    }    
    return answer;
}
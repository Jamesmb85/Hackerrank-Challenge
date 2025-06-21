#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int max_and = 0;
  int max_or = 0;
  int max_Xor = 0;
  
  for(int i = 1; i < n; i++){
    for(int j = i+1; j <=n; j++){
        if(max_and < (i&j) && (i&j) < k){
            max_and = i&j;
        }
        if(max_or < (i|j) && (i|j) < k){
            max_or = i|j;
        }
        if(max_Xor < (i^j) && (i^j) < k){
            max_Xor = i^j;
        }                 
    }
  }
  
  printf("%d\n%d\n%d\n", max_and, max_or, max_Xor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}

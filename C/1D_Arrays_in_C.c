#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    //take input from the stdout
    int n;
    scanf("%d",&n); // input
    
    int sum = 0;
    int *arr = (int*) malloc(n * sizeof(int)); // using the malloc function and the memory is allocated on the heap at runtime
    
    for (int i = 0 ; i < n; i++){
        scanf("%d",&arr[i]);
        sum += arr[i];
    }
    
    printf("%d",sum); // printing the sum
    
    free(arr); // you have finished with the array, use free(arr) to deallocate the memory.
    arr = NULL;
      
    return 0;
}

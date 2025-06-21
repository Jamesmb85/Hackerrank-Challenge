#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i;
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }


    // Iterate over the first half and for every index i,
    // swap arr[i] with arr[n - i - 1]
    for (int i = 0; i < num / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[num - i - 1];
        arr[num - i - 1] = temp;
    }  

    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
    return 0;
}

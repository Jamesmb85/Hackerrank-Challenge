#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    int number = 0;
    
    while(n > 0){
        //grab the last digit and add it to number
        number+=n%10;
        //divide the input by 10
        n = n/10;
    }

    printf("%d", number);
    return 0;
}

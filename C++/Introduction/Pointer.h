#include <stdio.h>
#include <stdlib.h>

void update(int *a,int *b) { //function takes oon 2 pointers are arguments
    // Complete this function    
    *a = *a + *b; //the value a points to is added to the value b points to
    
    *b =abs(*a - *b -*b); //a* is now (*a + *b) from above. 
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
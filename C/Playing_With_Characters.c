#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char ch; 
    char s[100]; 
    char sen[100];

    scanf("%c",&ch);
    scanf("%s",s);
    //getchar() returns a character from stdin. In fact, it’s the same as calling getc(stdin).
    getchar();
    scanf("%[^\n]%*c",sen);

    printf("%c\n",ch);
    printf("%s\n",s);
    printf("%s\n",sen);    
    return 0;
    
}

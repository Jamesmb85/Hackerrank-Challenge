#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    //create a char array of size 1000
    char str[1000];
    //read in a string
    scanf("%s",str);
    //initialize our counters
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,m=0,j=0;
    //loop through each character in the string until you get to the end
    for(int i=0;i<strlen(str);i++){
        //check if value at string index is a digit
        if (isdigit(str[i])){
            if (str[i]=='0'){
                a++;
            }
            if (str[i]=='1') {
                b++;
            }
            if (str[i]=='2'){
                c++;
            }
            if (str[i]=='3'){
                d++;
            }
            if (str[i]=='4'){
                e++;
            }
            if (str[i]=='5'){
                f++;
            }if (str[i]=='6'){
                g++;
            }if (str[i]=='7'){
                h++;
            }if (str[i]=='8'){
                m++;
            }if (str[i]=='9'){
                j++;
        }
    }
}

printf("%d %d %d %d ",a,b,c,d);
printf("%d %d %d %d %d %d",e,f,g,h,m,j);  
  
    return 0;
}

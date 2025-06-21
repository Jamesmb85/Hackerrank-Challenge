#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    
    //Write your logic to print the tokens of the sentence here.
    char *token = strtok(s, " ");
    
    //keep printing words until we don't reach the delimter
    while(token != NULL){
        printf("%s\n", token);
        token = strtok(NULL, " ");
    }
    
    
    return 0;
}

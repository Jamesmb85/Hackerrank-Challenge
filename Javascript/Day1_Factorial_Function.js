'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}


/*
 * Create the function factorial here
 */
function factorial(n){
    //Done with recursion
    if(n < 0){
        return n;
    }
    
    else if (n == 0){
        return 1;
    }
    
    else{
        return (n * factorial(n-1));
    }
	
/*  
Comments using recursion to solve this problem came from the foloowing URL:
https://medium.freecodecamp.org/how-to-factorialize-a-number-in-javascript-9263c89a4b38

First Part of the recursion method 
You need to remember that you won’t have just one call, you’ll have several nested calls 
    
Each call: n === "?"        	         n * factorial(n - 1) 
1st call – factorial(5) will return    5  * factorial(5 - 1) // factorial(4) 
2nd call – factorial(4) will return    4  * factorial(4 - 1) // factorial(3) 
3rd call – factorial(3) will return    3  * factorial(3 - 1) // factorial(2) 
4th call – factorial(2) will return    2  * factorial(2 - 1) // factorial(1) 
5th call – factorial(1) will return    1  * factorial(1 - 1) // factorial(0) 
   
Second part of the recursion method 
The method hits the if condition, it returns 1 which n will multiply itself with 
The function will exit with the total value 
   
5th call will return (5 * (5 - 1))     // n = 5 * 4 
4th call will return (20 * (4 - 1))    // n = 20 * 3 
3rd call will return (60 * (3 - 1))    // n = 60 * 2 
2nd call will return (120 * (2 - 1))   // n = 120 * 1 
1st call will return (120)             // n = 120 
  
If we sum up all the calls in one line, we have 
(5 * (5 - 1) * (4 - 1) * (3 - 1) * (2 - 1)) = 5 * 4 * 3 * 2 * 1 = 120 
*/ 
}


function main() {
    const n = +(readLine());
    
    console.log(factorial(n));
}




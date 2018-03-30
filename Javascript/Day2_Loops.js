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
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    
    var vowels =  ""; //declare vowels as an empty string
    var consonant = ""; //declare consonant as an empty string
     
    //Need to iterate through s to find out if it is a vowel or consonant
    //if it is a vowel assign to variable
    //if it is a consonant assign to a different variable
    //need two more loops to print contents of variables
	//The let statement declares a block scope local variable, optionally initializing it to a value.
    for(let a = 0; a < s.length; a++){
        //could define an array and if vowel is in array then attach to vowels variable, but we will use if-else statements
		//s[a] is the value in the string as position a. So, s[0] is the first letter in the string
        if(s[a] == "a"){
			vowels = vowels + s[a]; //a is attached to vowels
        }
        
        else if (s[a] == "e"){
            vowels = vowels + s[a]; //e is attached to vowels
        }
        
        else if (s[a] == "i"){
            vowels = vowels + s[a]; //i is attached to vowels
        }
        
        else if (s[a] == "o"){
            vowels = vowels + s[a]; //o is attached to vowels
        }
        
        else if (s[a] == "u"){
            vowels = vowels + s[a]; //u is attached to vowels
        }
        
        else{
            consonant = consonant + s[a]; //any other letter beside a vowel is attached to consonant
        }
    
    }
    
    //need two more loops to print contents of vowels and consonant on a newline
	//The let statement declares a block scope local variable, optionally initializing it to a value.
    for(let b = 0; b < vowels.length; b++){
        console.log(vowels[b]); //vowels[b] is the letter at a certain index in the string
    }
    
    for(let c = 0; c < consonant.length; c++){
        console.log(consonant[c]); //consonant[c] is the letter at a certain index in the string
    }
    
}



function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
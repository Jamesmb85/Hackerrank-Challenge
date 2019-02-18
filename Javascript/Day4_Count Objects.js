// Objective

// In this challenge, we learn about iterating over objects. Check the attached tutorial for more details.

// Task

// Complete the function in the editor. It has one parameter: an array, a, of objects. 
// Each object in the array has two integer properties denoted by x and y. 
// The function must return a count of all such objects o in array a that satisfy o.x == o.y.

// Input Format

// The first line contains an integer denoting n.
// Each of the subsequent n lines contains two space-separated integers describing the values of x and y.

// Constraints
// 5<=n<=10
// 1<=x, y<=100

// Output Format

// Return a count of the total number of objects o such that o.x == o.y. Locked stub code in the editor prints the returned value to STDOUT.

// Sample Input 0

// 5
// 1 1
// 2 3
// 3 3
// 3 4
// 4 5

// Sample Output 0

// 2

// Explanation 0

// There are n = 5 objects in the objects array:

// Because we have two objects that satisfy (i.e., and ), we return 2 as our answer.



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
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    var result = 0;

    for (var a = 0; a < objects.length; a++){
        if (objects[a].x == objects[a].y) {
            result += 1;
        }
    }

    return result;
}


function main() {
    const n = +(readLine());
    let objects = [];
    
    for (let i = 0; i < n; i++) {
        const [a, b] = readLine().split(' ');
        
        objects.push({x: +(a), y: +(b)});
    }
    
    console.log(getCount(objects));
}
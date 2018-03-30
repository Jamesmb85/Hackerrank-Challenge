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

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    //BubbleSort
	
	let arrayLength = nums.length; //length of nums array is assigned to variable
	
	//Traverse through all array elements
	for(let a = arrayLength - 1; a >=0; a--){
		//Last i elements are already in place
		for(let b = 1; b <= a; b++){
            //Swap if the element found is greater
            //than the next element
			if(nums[b -1] > nums[b]){
				let tempVariable = nums[b - 1];
				nums[b - 1] = nums[b];
				nums[b] = tempVariable;
			}
		}
	}
	
	//returns the second largest element
	return nums[nums.length - 2];
	
}

function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
// Solution Number 1 

// Time Complexity - O(n^2)
// Space Complexity - O(1)
function twoNumberSum(array, targetSum) {
  for (let i = 0; i <= array.length; i++) {
    for (let j = 0; j < array.length && j !== i; j++) {
      let result = array[i] + array[j];
      if (result === targetSum) {
        return [array[i], array[j]];
      }
    }
  }
  return [];
}

// sample input

const array = [3, 5, -4, 8, 11, 1, -1, 6];
const targetSum = 10;

const result = twoNumberSum(array, targetSum);

console.log(result);

// Solution Number 2 

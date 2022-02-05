// Time Complexity O(n)
// Space Complexity O(n)

function nonConstructibleChange(coins) {
  coins.sort((a, b) => a - b);
  let value = 1 // minimun possible change to be created;

  for (const coin of coins) {
     if (coin > value) return value;

    value += coin;
  }

  return value;
}

console.log(nonConstructibleChange([5, 7, 1, 1, 2, 3, 22]));

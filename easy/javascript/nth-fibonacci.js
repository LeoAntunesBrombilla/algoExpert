// time complexity and space complexity O(n)

function getNthFib(n, memoize) {
  let knowMemoize = { 2: 1, 1: 0 } || memoize;
  if (n in knowMemoize) {
    return knowMemoize[n];
  } else {
    knowMemoize[n] = getNthFib(n - 1, knowMemoize) + getNthFib(n - 2, knowMemoize);
    return knowMemoize[n];
  }
}

console.log(getNthFib(6));

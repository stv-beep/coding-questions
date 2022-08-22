//8. - Square of symbols

//method 1
let n = 5
let square = ""

for(let i = 0; i < n; i++) {
  for(let j = 0; j < n; j++) {
    square += "+"
  }
  square += "\n"
}

console.log(square)

//method 2
function generateSquare(n){
    return Array(n).fill('+'.repeat(n)).join('\n')
}

console.log(generateSquare(10))
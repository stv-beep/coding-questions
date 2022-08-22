//7. - fibonacci

//method 1
function fibonacci(number){
    let first = [0,1]
    
    for (var i = 2; i <= number; i++){
      first[i] = first[i-1] + first[i-2]
    }
        
    console.log(first)
    return first[number]
}
  
console.log(fibonacci(10))

//method 2
function fibonacci2(n){
    var prev2 = 0
    var prev1 = 1
    var num = 0
    for (var i = 2; i <= n; i++){
        num = prev2 + prev1
        prev2 = prev1
        prev1 = num
      }
   return num
}

console.log(fibonacci2(10));
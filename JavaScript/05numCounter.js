//5. - count numbers in a string
var str = "aitgjr9eyje89yhj4589jw985jhw"

//method 1
var regex = /[0-9]/g
var num = str.match(regex).length
console.log(num+' numbers')


//method 2
function checkNum(n){
    return n.match(regex)
}
var arr = str.split("")
var num2 = arr.filter(checkNum).length
console.log(num2+' numbers')
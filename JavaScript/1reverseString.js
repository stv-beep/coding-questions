//1. - reverse a string
var str = "xoriso"
var result = ""

//method 1
for (var i = str.length-1; i >= 0; i--){
    result += str.charAt(i)
}
console.log(result)


//method 2
var arr = str.split("")
var reverseArray = arr.reverse();
var result2 = reverseArray.join("")
console.log(result2)
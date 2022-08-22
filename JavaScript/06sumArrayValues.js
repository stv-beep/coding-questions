//6. - sum array values
var arr = [5,7,9,6,3,5]

//method 1
var total = 0
for (var i = 0; i < arr.length; i++){
    total+=arr[i]
}
console.log('total:',total)

//method 2
var total2 = arr.reduce((a,b)=> a+b, 0)
console.log('total 2:',total2)
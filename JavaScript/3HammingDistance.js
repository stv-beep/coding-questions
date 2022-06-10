//3. - Hamming distance
var str1 = "patete"
var str2 = "patata"

var distance = 0

if (str1.length == str2.length){

    for (var i = 0; i < str1.length; i++){
        if (str1[i] != str2[i]){
            distance++
        }
    }
    console.log(distance)

} else {
    console.log('different lengths')
}
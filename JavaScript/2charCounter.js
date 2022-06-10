//2. - count character repetitions
var text = "sdgfopgodfkgmsdkofnishndfoiphnfodjghnfjha"
var char = 'f'

var sum = 0

for (var i = 0; i < text.length; i++){
    if (text[i].toLowerCase() == char){
        sum++;
    }
}
console.log(char,'character appears',sum,'times')
/* FreeCodeCamp */
/* JavaScript Algorithms and Data Structures Projects */

function convertToRoman(num) {
    //dec values
    //roman values
    const dec = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    const roman = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'];
    let result = ''

    dec.forEach(function(number, index) {
        while (num >= number) {
            result += roman[index]
            num-=number
        }
    }) 
    return result;
}

convertToRoman(36)

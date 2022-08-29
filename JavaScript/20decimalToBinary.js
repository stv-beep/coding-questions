/* From decimal to binary */
/* mouredev.weeklychallenge2022 */
/* Crea un programa se encargue de transformar un número decimal a binario 
sin utilizar funciones propias del lenguaje que lo hagan directamente. */

function decimalToBinary(decimal){
    let n = decimal
    let reminder
      
    while (n > 0) {

        reminder = n % 2
        n = parseInt(n/=2) 
        console.log(reminder)
    }
}

decimalToBinary(387)
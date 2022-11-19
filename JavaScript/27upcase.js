/* 27. - mouredev.weeklychallenge2022 #16 */
/* EN MAYÚSCULA / UPPERCASE
Crea una función que reciba un String de cualquier tipo y se encargue de poner en mayúscula la primera letra de cada palabra.
- No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente. */


let s = "seguimos con los versos perversos"

function capitalize(s) {
  array = s.split(" ")
  res = ""
  for (let i = 0; i < array.length; i++) {
    res = array[i].charAt(0).toUpperCase() + array[i].substring(1,array[i].length)
    console.log(res)
  }
}


capitalize(s)

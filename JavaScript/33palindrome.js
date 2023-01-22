/* FreeCodeCamp */
/* JavaScript Algorithms and Data Structures Projects */
/* Return true if the given string is a palindrome. Otherwise, return false.
A palindrome is a word or sentence that's spelled the same way both forward and backward, ignoring punctuation, case, and spacing.
Note: You'll need to remove all non-alphanumeric characters (punctuation, spaces and symbols) and turn everything into the same case (lower or upper case) in order to check for palindromes.
We'll pass strings with varying formats, such as racecar, RaceCar, and race CAR among others.
We'll also pass strings with special symbols, such as 2A3*3a2, 2A3 3a2, and 2_A3*3#A2. */

//solution 1
function palindrome(str) {
    let newStr = str.toLowerCase().replace(/[\W_]+/g,"")
    const arrRev = newStr.split("").reverse().join("")

    return arrRev === newStr
}

palindrome("_eye")
palindrome("A man, a plan, a canal. Panama")

//solution 2
function palindrome2(str) {
    let newStr = str.toLowerCase().replace(/[\W_]+/g,"")

    let reversed = ''
    for (let i = newStr.length-1; i >= 0 ; i--) {
        reversed+=newStr[i]
    }
    return reversed === newStr
}
  

palindrome2("not a palindrome")
palindrome2("0_0 (: /-\ :) 0-0")

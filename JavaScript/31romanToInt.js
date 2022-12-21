/* Leetcode 13. Roman to Integer */
/* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Given a roman numeral, convert it to an integer. */

const romanToInt = function(s) {
    let result = 0

    let symbols = {'I': 1,'V': 5,'X': 10,'L': 50,'C': 100,'D': 500,'M': 1000 }

    //converting substraction cases in just simple numbers
    s = s.replace('IV','IIII').replace('IX','VIIII').replace('XL','XXXX')
    s = s.replace('XC','LXXXX').replace('CD','CCCC').replace('CM', 'DCCCC')
    
    for (let i = 0; i < s.length; i++) {
      result += symbols[s[i]]

    }

    return result
};

romanToInt("MCMXCIV")
  
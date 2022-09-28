/* Leetcode 1678. Goal Parser Interpretation */
/*You own a Goal Parser that can interpret a string command. 
The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command. */


let interpret = function(command) {
    let str = ''
    for (var i = 0; i < command.length; i++){
        if (command.charAt(i) == 'G'){
          str+='G'
        } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')'){
          str+='o'
          i++
        } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
          str+='al'
        }
    }
    return str
};


interpret("G()(al)")
interpret("G()()()()(al)")
interpret("(al)G(al)()()G")
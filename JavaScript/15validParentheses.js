/* Leetcode 20. Valid Parentheses*/
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order. */

/**
 * @param {string} s
 * @return {boolean}
 */
 var isValid = function(s) {
    
    let copy = []
    
    for (var i = 0; i < s.length; i++) {
        
        if (s[i] == "(") {
            copy.push(")")
          //console.log(copy.length)
        } else if (s[i] == "{") {
            copy.push("}")
          //console.log(copy.length)
        } else if (s[i] == "[") {
            copy.push("]")
          //console.log(copy.length)
        } else if (copy.pop() != s[i]) {
            return false
        }
    }
    return !copy.length //!0 !1
};

isValid("()")
isValid("()[]{}")
isValid("(]")
isValid("]")
isValid("([)]")
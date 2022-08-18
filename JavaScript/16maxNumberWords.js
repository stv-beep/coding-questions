/* Leetcode 2114. Maximum Number of Words Found in Sentences*/
/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.*/


//method 1
/**
 * @param {string[]} sentences
 * @return {number}
 */

 var mostWordsFound = function(sentences) {
    var s = []
    var words = 0
    for (var i = 0; i < sentences.length; i++) {
        words = sentences[i].split(" ").length
      	s[i] = words
    }
  	return Math.max(...s)
};

mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great thanks very much"])
mostWordsFound(["please wait", "continue to fight", "continue to win"])



//method 2
var mostWordsFound = function(sentences) {
    var space = ' '
    var max = []
    var count = 0
    for(var i=0;i<sentences.length;i++){
        for(var j=0;j<sentences[i].length;j++){
            if(sentences[i][j] === space){
                 count++
            }
        }
        max.push(count)
        count = 0
    }
    var result = Math.max(...max)
    return result + 1
};

/* Leetcode 100. Same Tree */
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

//method 1
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
 var isSameTree = function(p, q) {
    return isEqual = JSON.stringify(p) === JSON.stringify(q)
};

isSameTree([1,2,3],[1,2,3])
isSameTree([1,2],[1,null,2])


//method2
var isSameTree = function(p, q) {
    return isEqual = p.toString() === q.toString()
};


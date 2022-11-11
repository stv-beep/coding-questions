# jutge.org P33839 - Sum of digits
""" Write a program that reads several numbers and prints the sum of the digits of each one.
Input consists of a sequence of natural numbers.
For every number, print the sum of its digits following the format of the example. 
29: The sum of the digits of 29 is 11. """


def digitsSum():
    num = input()
    digits = list(str(num))
    sum = 0
    for i in digits:
        sum+=int(i)
    print(sum)

""" Leetcode 1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits. 
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15 """

digitsSum()

n = 234

def subtractProductAndSum(n) -> int:
    digits = list(str(n))
    sum = 0
    product = 1
    for i in digits:
        product*=int(i)
        sum+=int(i)
    return product-sum

subtractProductAndSum(n)

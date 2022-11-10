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


digitsSum()

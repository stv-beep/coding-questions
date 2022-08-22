#1. - reverse a string
str = 'xoriso'

""" method 1 """
print(str[::-1])

""" method 2 """
result = ''
for letter in str:
    result = letter + result

print(result)
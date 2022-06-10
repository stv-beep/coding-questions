#5. - count numbers in a string
str = "aitgjr9eyje89yhj4589jw985jhw"

""" method 1 """
num = 0

for i in str:
    if i.isnumeric():
        num+=1
print(num,'numbers')

""" method 2 """
import re
print(len(re.sub("[^0-9]", "", str)),'numbers')

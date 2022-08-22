#6. - sum array values
arr = [5,7,9,6,3,5]

""" method 1 """
total = 0
for i in arr:
    total+=i
print('total:',total)

""" method 2 """
total2 = sum(arr)
print('total 2:',total2)
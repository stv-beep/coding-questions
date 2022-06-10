#3. - Hamming distance
str1 = "patete"
str2 = "patata"

distance = 0

if len(str1) == len(str2):
    for i in range(len(str1)):
        if str1[i] != str2[i]:
            distance+=1
    print(distance)
else:
    print('different lengths')
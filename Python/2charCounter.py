#2. - count character repetitions
text = "sdgfopgodfkgmsdkofnishndfoiphnfodjghnfjha"
char = 'f'

sum = 0

for i in text:
    if i == char:
        sum+=1
print(char,'character appears',sum,'times')
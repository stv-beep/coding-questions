# 26. - mouredev.weeklychallenge2022 #31
""" Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
- Utiliza el menor número de líneas para resolver el ejercicio. """


def thirtyLeapYears(year):

    comingYear = year+1
    count = 0

    while count < 30:
        if (comingYear % 4 == 0 and comingYear % 100 != 0) or (comingYear % 400 == 0):
            count+=1
            print(comingYear)
        comingYear+=1
    

year = int(input())
print(thirtyLeapYears(year))

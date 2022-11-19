# 27. - mouredev.weeklychallenge2022 #16
""" EN MAYÚSCULA / UPPERCASE
Crea una función que reciba un String de cualquier tipo y se encargue de poner en mayúscula la primera letra de cada palabra.
- No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente. """


def capitalize(s: str):

    for word in s.split(" "):
        print(word[0].upper() + word[1::].lower())
        
            
print(capitalize("aprendiendo pitón"))
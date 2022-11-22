# 28. - mouredev.weeklychallenge2022 #1
""" ¿ES UN ANAGRAMA? / ANAGRAM
Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
NO hace falta comprobar que ambas palabras existan. Dos palabras exactamente iguales no son anagrama. """

def isAnagram(s1: str, s2: str):
        if s1 == s2:
                return False
        else:
                return sorted(s1.lower()) == sorted(s2.lower())


print(isAnagram("amor", "roma"))
print(isAnagram("toma", "roma"))
print(isAnagram("roma", "roma"))

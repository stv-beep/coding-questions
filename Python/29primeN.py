# 29. - mouredev.weeklychallenge2022 #3
""" ¿ES UN NÚMERO PRIMO? / IS IT A PRIME NUMBER?
Escribe un programa que se encargue de comprobar si un número es o no primo.
Hecho esto, imprime los números primos entre 1 y 100. """

def isPrime(n: int):
    is_prime = True
    for i in range(2,n):
        if (n % i) == 0:
            is_prime = False
    return is_prime


print(isPrime(11))
print("Prime numbers from 1 to 100:")
def primes():
    for i in range(2,100):
        isPrimeN = isPrime(i)
        if isPrimeN:
            print(i)

primes()

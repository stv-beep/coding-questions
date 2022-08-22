#7. - fibonacci
def fibonacci(number):
   n1, n2 = 0, 1
   count = 0
   print("Last Fibonacci add of",number,":")
   while count < number:
         nth = n1 + n2

         n1 = n2
         n2 = nth
         count += 1
         if count == number:
            print(n1)
   
fibonacci(10)
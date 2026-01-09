try:
   a=int(input("enter a number:"))
   b=int(input("enter a number:"))
   c=a/b
except ZeroDivisionError :
   print("division by zero")
except ValueError:
   print("not a number")
else:
   print(c)
finally:
   print("program ends")

str=input("Enter the string")
lower=""
upper=""
for i in str:
    if i.islower():
      lower+=i
    if i.isupper():
       upper+=i
print(lower+upper)
      
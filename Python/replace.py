a=input("Enter a string")
if len(a)>0:
    b=a.replace(a[0],"$")
print(b)

if len(b)>0:
    b=b[-1] + b[1:-1] + b[0]
print(b)

     
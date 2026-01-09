#  *
# *  *
num=int(input("enter the number:"))
for i in range(1,num+1,):
    for j in range(1,num+1-i):
        print(end=" ")
    for k in range(1,i):
        print("*",end=" ")


    print( )
       
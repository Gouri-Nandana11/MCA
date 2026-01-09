#l=int(input("enter the number: "))
for row in range(4):
    for col in range(5):
        if col==0 or row==3 :
            print("*",end=" ")
        else:
          print(" ",end=" ")
    print()
        
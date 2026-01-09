#sumofdigits
def sumDigits(num):
   if(len(num)==0):
      return 0
   else:
      return num[0]+sumDigits(num[1:])



digit=input("enter the number: ")
num=[]
for x in digit:
   num.append(int(x))
   

print(sumDigits(num))

def power_T(num):
    if num<0:
        raise ValueError("negative number")
    if num ==0:
       return False
      
    while num %2 ==0:
        num =num // 2
    return num ==1
try:
    num= int(input("Enter the number:"))
    if power_T(num):
        print(num,"is power of two")
    else:
        print("not power")
    
except ValueError as e:
    print("Error:",e)
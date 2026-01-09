
def sum_list(list1):
   
     if(len(list1)<=0):
        return 1
     else:
         return list1[0]+sum_list(list1[1:])
         





list1=list(map(int,input("enter the list: ").split(" ")))

print(sum_list(list1))


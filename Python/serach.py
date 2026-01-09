def search(l1,item):
 count=0
 for i in l1:
   if item==i:
    count+=1
 return count   
  
l1=input("enter the values").split()
item=input("Enter the item to serach")
print("item coccurence",search(l1,item))

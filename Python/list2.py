s1 = input("enter the first list: ").split(" ")
s2 = input("the second list:").split(" ")
i = 0
for s in s1:
 if s not in s2:
  print(s)
i+=1

inp=int(input("enter the line to remove:"))
with open("firstfile.txt",'r+') as file:
    line =file.readlines()
with open("firstfile.txt",'w') as file:
     l=len(line) 
     for i in range(l):
          if i!=(inp-1):
            file.write(line[i])
print("..updated fie..")
with open("firstfile.txt",'r') as f:
     print(f.read())

          
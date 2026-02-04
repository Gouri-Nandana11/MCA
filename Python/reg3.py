import re
s="Kiran is 23 Arun is  34" \
"Gouri is 22 Kaannan is 25 "
age=r'\d{2}'
name=r'[A-Z][a-z]+'
res1=re.findall(age,s)
res2=re.findall(name,s)
x=0
for n in res2:
     print(n ,":",res1[x] )
     x+=1
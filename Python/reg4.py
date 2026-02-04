import re
string = ''' abc \t 123
de 45 \n  f 678'''
pat=r'\s+'
replace=''
res=re.sub(pat,replace,string)
print(res)
import re
Str = "sat, hat, mat, pat,kat"
someStr = re.findall("[hm]at", Str)
for i in someStr:
    print(i)
import re
passw=input("Enter the pass:")
pattern=r"(?=.[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$#@].){6,16}"
if re.match (pattern,passw):
    print("valid")
else:
    print("not valid")
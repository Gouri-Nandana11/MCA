import re

with open("/home/user/html/python/file1.txt", "r") as file:
    text = file.readlines()

pattern = r"^\s*s.*e\s?$"

matches = []

for line in text:
    if re.match(pattern, line):
        matches.append(line)

if matches:
    print("lines are:")
    for n in matches:
        print(n, end="")


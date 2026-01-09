import re


with open("data.txt", "r") as file:
    text = file.read()


pattern = r'(?<!\d)[6-9]\d{9}(?!\d)'


matches = re.findall(pattern, text)


if matches:
    print("Phone numbers found:")
    for number in matches:
        print(number)
else:
    print("No valid phone numbers found.")

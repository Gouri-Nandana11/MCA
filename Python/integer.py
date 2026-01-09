# Take input and convert to integers
list1 = list(map(int, input("Enter the list of numbers: ").split()))
list2 = list(map(int, input("Enter the second list: ").split()))

# Compare lengths
if len(list1) == len(list2):
    print("Equal length")
else:
    print("Not equal length")

# Compare sums
if sum(list1) == sum(list2):
    print("Sums are equal")
else:
    print("Sums are not equal")
for x in list1:
    if x in list2:
        print(x)
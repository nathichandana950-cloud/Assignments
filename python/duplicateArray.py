nums = input("Enter numbers separated by space: ") 
numbers = [int(x) for x in nums.split()]  

count = {}

for num in numbers:
    if num in count:
        count[num] += 1
    else:
        count[num] = 1


duplicates = [key for key, value in count.items() if value > 1]


if duplicates:
    print("Duplicates in the array:", duplicates)
else:
    print("No duplicates found!")
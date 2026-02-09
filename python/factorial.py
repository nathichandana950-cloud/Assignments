num = int(input("Enter a number:"))
fact=1
for i in range(1,num+1):# Calculate factorial using a loop
    fact*=i # same as factorial = factorial * i
print("The factorial of "+ str(num) + " is " + str(fact))
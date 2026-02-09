x=int(input("Enter the Number:"))
t=0
while x>0:
    r=x%10
    t=t*10+r
    x=x//10
    print("Reverse number = ",t)
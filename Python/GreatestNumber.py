print("Greatest in 3 numbers")
print("Enter in 3 nums")
a=int(input())
b=int(input())
c=int(input())
if((a>b) and (a>c)):
    print("Greatest number is - ",a)
elif(b>a and b>c):
    print("Greatest number is - ",b)
else:
    print("Greatest number is - ",c)

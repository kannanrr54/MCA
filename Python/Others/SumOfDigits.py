print("Enter in a number to get its digit sum")
x=int(input())
s=0;
while (x>0):
    r=x%10
    x=int(x/10)
    s+=r
print("Sum of Digits is",s)
          


print("Enter the two numbers")
a=int(input())
b=int(input())
gcd=0
if(a<b):
    g=b
else:
    g=a
for i in range(g,1):
    if(a%i==0 and b%i==0):
        print(i)
        gcd=i
        break
print(gcd)

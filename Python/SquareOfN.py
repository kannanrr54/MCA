print("Enter the number of elements")
n=int(input())
a=[]
b=[]
print("Enter the elements")
for i in range(0,n):
    s=int(input())
    a.append(s)
    b.append(s**2)
print("List - ",a,"\nSquareList - ",b)


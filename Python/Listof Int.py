print("Enter List size")
n=int(input())
a=[]
print("Enter List elements")
for i in range(0,n):
        s=input()
        if(int(s)>100):
                a.append("over")
        else:
                a.append(s)

print(a)

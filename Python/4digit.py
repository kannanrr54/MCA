import random
import math
print("Enter the limit")
x=int(input())
y=int(input())
f=1
a=[]
v=[]
for i in range(x,y):
    for j in str(i):
        if(int(j)%2!=0):
            f=0
    if(f==1):
        a.append(i)      
    f=1
for i in a:
    if(math.ceil(math.sqrt(int(i)))*math.sqrt(int(i))==int(i)):
        v.append(i)  
print(v)
        



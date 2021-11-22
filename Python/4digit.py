import random
import math
print("Enter the limit")
f=1
a=[]
v=[]
for i in range(0,6000):
    d=format(random.randint(1000,9999), '04d')
    for j in str(d):
        if(int(j)%2!=0):
            f=0
    if(f==1):
        a.append(d)      
    f=1
for i in a:
    if(math.ceil(math.sqrt(int(i)))*math.sqrt(int(i))==int(i)):
        v.append(i)
    
print(v)
        



a=[1,2,3,4,5,6]
e=[]
o=[]
for i in a:
    if i%2==0:
        e.append(i)
    else:
        o.append(i)      
print(e," is Even")
print(o," is Odd")

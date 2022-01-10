print("printing positive values from list")
a=[-1,-4,-9,0,1,4,-97,2]
b=[]

for i in range(0,len(a)):
    if(a[i]>0):
        b.append(a[i])
print("Positive list",b)

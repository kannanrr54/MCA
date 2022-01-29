x = open("txt.txt", "r")
c = open("copy.txt","w")
z=1
a=x.readlines()
for i in a:
    if z%2!=0:
       c.write(i)
    z=z+1  
c.close()
x.close()
c = open("copy.txt","r")
p=c.readlines()
print(p)



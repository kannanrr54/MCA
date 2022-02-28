x = open("txt.txt", "r")
a=x.readline()
b=[]
for i in x.readlines():
    b.append(i.strip())
print(b)



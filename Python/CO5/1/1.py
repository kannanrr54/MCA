x = open("txt.txt", "r")
a=x.readlines()
print(a)
for i in x.readlines():
    a.append(i.strip())
print(a)



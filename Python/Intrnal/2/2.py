f=open("input.txt","r")
print("Actual file")
print("")
for i in f.readlines():
        print(i.strip())
f.close()
print("")
print("Output--------------------------------")
print("")
f=open("input.txt","r")
for c in f.readlines():
    if(len(c.split(" "))>5 and c[0].isupper()):
        print(c.strip())
f.close()





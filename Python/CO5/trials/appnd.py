x = open("txt.txt", "r")
c = open("copy.txt","a")
a=x.readlines()
print("First file : --")
for i in a:
	c.write(i.title())
	print(i)
c.close()
x.close()
print("------------------------------------------")
print("Modified file : --")
c = open("copy.txt","r")
p=c.readlines()
for d in p:
	print(d)
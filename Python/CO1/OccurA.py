print("Enter the number of Names")
n=int(input())
a=[]
print("Enter the Names")
for i in range(0,n):
    s=input()
    s+=" : "+str(s.count("a"))
    a.append(s)
print("Names and Occurences of a - ",a)


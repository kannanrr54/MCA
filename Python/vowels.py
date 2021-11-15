print("Enter a word")
a=[]
s=input()
for i in s:
    if(i in ("a","e","i","o","u")):
        a.append(i)
print(a)

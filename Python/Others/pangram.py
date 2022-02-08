import string
print("Enter a string")
l=input()
x=1
for i in string.ascii_lowercase:
    if(l.count(i)==0):
        x=0
if(x==0):
    print("Not Pangram")
else:
    print("Pangram")

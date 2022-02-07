import csv

f=open("b.csv")
x=csv.reader(f)
c=1
for i in x:
    if(c%2!=0):
        print(i)
    c=c+1
f.close()
print("-----------------------------")
c=0
f=open("b.csv")
x=csv.reader(f)
for i in x:
    for e in i:
        if(c==2):
            print(e)
        c=c+1
    c=0
f.close()
print("-----------------------------")
c=0
f=open("b.csv")
x=csv.reader(f)
for i in x:
    for e in i:
        if(e=="3"):
            break
    c=c+1
f.close()
print("-----------------------------")
h=0
f=open("b.csv")
x=csv.reader(f)
for i in x:
    for e in i:
        if(h==c):
            print(e)
        h=h+1
    h=0
    
        
    

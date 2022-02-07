import csv

s=input("Enter a string")
c=open("1.csv","w")
c.writer("Letter,count")
for i in set(s):
    print(i,"-",s.count(i))
    




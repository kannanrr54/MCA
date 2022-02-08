import csv 
f=open("q.csv","r+",newline="")
x=csv.DictWriter(f,fieldnames=["a","b"])
x.writeheader()
d={"a":"1","b":"1","a":"1","b":"1"}
x.writerow(d)
d=csv.DictReader(f)
for i in d:
    print(i)
f.close()



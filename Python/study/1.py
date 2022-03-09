import csv

w=[{"a1":"a","a2":"b"},{"a1":"a","a2":"b"}]
s=open("a.csv","w",newline="")
d=csv.DictWriter(s,fieldnames=["a1","a2"])
d.writeheader()
d.writerows(w)
s.close()
s=open("a.csv","r+",newline="")
d=csv.DictReader(s)
for i in d:
    print(i)
s.close()

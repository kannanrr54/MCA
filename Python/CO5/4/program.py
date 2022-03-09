import csv
with open("test.csv") as f:
    for i in csv.DictReader(f):
        print(i['1'])
s=open("test.csv","w",newline="")
d=csv.writer(s)
d.writerow(["a","b"])
s.close()
s=open("test.csv","r")
d=csv.reader(s)
for i in d:
    print(i)


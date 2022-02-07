import csv
with open("test.csv","r") as f:
    c=csv.reader(f)
    for i in c:
        print(','.join(i))

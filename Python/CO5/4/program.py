import csv
with open("test.csv") as f:
    for i in csv.DictReader(f):
        print(i['1'])

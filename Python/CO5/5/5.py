import csv 
dict_value = [
{"name":"A","job":19},
{"name":"B","job":19},
{"name":"C","job":19},
]
fields = ["name","job"]
with open('t.csv','w',newline="") as csvfile:
    writer = csv.DictWriter(csvfile,fieldnames=fields)
    writer.writeheader()
    writer.writerows(dict_value)
    csvfile.close()
with open('t.csv','r',newline="") as csvfiles:
    readerobj = csv.reader(csvfiles)
    for rows in readerobj:
        print(rows)

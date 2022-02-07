import csv
f1=open("1.csv","w",newline="")
f2=open("input.csv")
head=["Name","MFC","DC","DS","ASE"]
f2x=csv.reader(f2)
f1x=csv.writer(f1)
f1x.writerow(head)
for i in f2x:
    f1x.writerow(i)
f1.close()
f2.close()
d=open("1.csv","r")
dr=csv.DictReader(d)
print("Percentage of each student")
print("Name - Percentage")
for i in dr:
    percentage=((int(i["MFC"])+int(i["DC"])+int(i["DS"])+int(i["ASE"]))/400)*100
    print(i["Name"]+"    - "+str(percentage))
d.close()
print("-----------------------")

print("Percentage of each student")
print("Subject - Average")
d=open("1.csv","r")
dr=csv.DictReader(d)
mfc=0
dc=0
ds=0
ase=0
for i in dr:
    mfc=mfc+int(i["MFC"])
    dc=dc+int(i["DC"])
    ds=ds+int(i["DS"])
    ase=ase+int(i["ASE"])
print("MFC     - ",mfc/10)
print("DC      - ",dc/10)
print("DS      - ",ds/10)
print("ASE     - ",ase/10)
d.close()




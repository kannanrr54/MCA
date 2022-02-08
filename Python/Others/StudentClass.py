class student:
    def __init__(x,ids,name):
        x.ids = ids
        x.name = name
    def display(x):
       print(" "+x.ids+" --   "+x.name)
print("enter the numnber of students")
s=int(input())
p=[]
for i in range(0,s):
    print("Enter student name")
    n=input()
    print("Enter student id")
    d=input()
    p.append(student(d,n))
print("Id -- Name")
for i in range(0,s):
    p[i].display()

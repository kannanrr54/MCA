class student:
    def __init__(x,ids,name,m1,m2,m3):
        x.ids = ids
        x.name = name
        x.m1=int(m1)
        x.m2=int(m2)
        x.m3=int(m3)  
    def display(x):
        if(int(x.ids)>2):
            print("Id : "+x.ids)
            print("Name : "+x.name)
            print("Percentage : "+x.name)
       
print("enter the numnber of students")
s=int(input())
p=[]
for i in range(0,s):
    print("Enter student name")
    n=input()
    print("Enter student id")
    d=input()
    print("Enter 3 marks")
    m1=input()
    m2=input()
    m3=input()
    p.append(student(d,n,m1,m2,m3))
    
print("Id -- Name")
for i in range(0,s):
    p[i].display()

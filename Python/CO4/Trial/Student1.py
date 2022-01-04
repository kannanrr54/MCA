class student:
    def __init__(x,roll,name):
        x.roll=roll;
        x.name=name;
    def display(x):
        print("Roll - ",x.roll)
        print("Name - ",x.name)
class test(student):
    def __init__(x,roll,name,mark):
        student.__init__(x,roll,name)
        x.mark=mark
    def displaymark(x):
        x.display()
        print("Mark - ",x.mark)
print("enter the numnber of students")
s=int(input())
p=[]
s=test(122,"Asa",12);
s.displaymark()


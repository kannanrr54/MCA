class employee:
    def __init__(x,salary):
        x.salary=salary
    def __lt__(x,new):
        if(x.salary<new.salary):
            print("e1 is high")
        else:
            print("e2 is high")
e1=employee(1000)
e2=employee(200)
print(e1<e2)

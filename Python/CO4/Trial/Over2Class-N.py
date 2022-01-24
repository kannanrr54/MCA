class emp:
    def __init__(self,salary,name):
        self.salary=salary
        self.name=name
class work:
    def __init__(self,name,days):
        self.name=name
        self.days=days
    def __mul__(self,other):
        return self.days*other.salary;
d=work("a",12)
e=emp(100,"a")
print(d*e)

        


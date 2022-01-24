class emp:
    def __init__(self,s1):
        self.s1=s1
    def __lt__(self,other):
        if(self.s1<other.s1):
            return True
        else:
            return False
        
e1=emp(int(input("Enter salary of e1")))
e2=emp(int(input("Enter salary of e2")))
if(e1<e2):
    print("e1 salary is less")
else:
    print("e2 salary is less")

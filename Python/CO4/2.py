class a:
	def __init__(self,n,p):
		self.name=n
		self.per=p
	def __mul__(self,other):
		return self.per *other.days
class b:
	def __init__(self,n,d):
		self.name=n
		self.days=d
n=input("Enter the name of the employee")
p=int(input("Enter the salary per day of the employee"))
d=int(input("Enter the number of days worked by the employee"))
obj1=a(n,p)
obj2=b(n,d)
print(obj1*obj2)

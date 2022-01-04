class rectnagle:
    def __init__(x,l,b):
        x.l=l;
        x.b=b;
    def area(x):
        return x.l*x.b
r1=rectnagle(1,2)
r2=rectnagle(3,2)
if(r1.area()>r2.area()):
    print("Area of First rect is bigger")
else:
    print("Area of Second rect is bigger")

        

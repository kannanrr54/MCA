class rectangle:
    def __init__(self,length,width):
        self.__length=length
        self.__width=width
    def area(self):
        return self.__length*self.__width
    def __lt__(self,other):
        if(self.area()<other.area()):
            return True
        else:
            return False
x=rectangle(int(input("Enter length of first rectangle")),int(input("Enter width of first rectangle")))
y=rectangle(int(input("Enter length of second rectangle")),int(input("Enter width of second rectangle")))
if(x<y):
    print("Area of First rectangle is smaller")
else:
    print("Area of Second rectangle is smaller")


        


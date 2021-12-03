Square=lambda s:s*s
Rectangle=lambda l,b:l*b
Triangle=lambda b,h:0.5*b*h
x=int(input("Enter the side of a square"))
print("area is ",Square(x))
print("Enter the Length and Breadth of a rectangle")
x=int(input())
y=int(input())
print("Area is" ,Rectangle(x,y))
print("Enter the Height and Breadth of a triangle")
x=int(input())
y=int(input())
print("area is ",Triangle(x,y))


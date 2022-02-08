print("Enter a string")
x=input()
if(x[len(x)-3:len(x)]!="ing"):
    print("Adding ing ",x+"ing")
else:
    print("Adding ly ",x[:len(x)-3]+"ly")

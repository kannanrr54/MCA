def am(x):
    s=0
    z=x
    while(x!=0):
        r=int(x%10)
        x=int(x/10)
        s+=r**3
    if(s==z):
        print("Number is amtrong")
    else:
        print("Number is not amstrong")
        
print("Enter in a number")
a=int(input())
am(a)

        


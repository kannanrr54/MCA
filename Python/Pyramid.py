print("Enter a number")
x=int(input())
s=1;
for i in range(1,x+1):
    s=i
    for j in range(1,i+1):
        print(s," ", end='')
        s+=i
    print("")

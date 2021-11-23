print("Enter one sentence with words repeating")
s=input()
for i in list(set(s.split())):
    print(i,"has occured",s.split().count(i),"times")

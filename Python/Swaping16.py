print("Enter a string seperated with space")
s=input()
s1=s.split(" ")[0]
s2=s.split(" ")[1]
print("Altered string is ",s2[0]+s1[1:]+" "+s1[0]+s2[1:])

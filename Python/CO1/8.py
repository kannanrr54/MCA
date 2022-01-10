print("Enter any string")
s=input()
s1=s[0]
s2=s[1:].replace(s[0],"$")
print("Altered string is ",s1+s2)

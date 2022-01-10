S1=int(input("Enter first list size"))
S2=int(input("Enter second list size"))
print("Enter elements of first list")
l1=[]
l2=[]
for i in range(0,S1):
    l1.append(int(input()))
print("Enter elements of second list")
for i in range(0,S2):
    l2.append(int(input()))
s1=0
s2=0
if(len(l1)==len(l2)):
    print("Lists has same length")
else:
    print("List does not have same length")
for i in l1:
    s1+=i
for i in l2:
    s2+=i
if(s1==s2):
    print("Sums are equal")
else:
    print("Sums are not equal")
if(set(l1).intersection(set(l2))):
    print("Common value exists")
else:
    print("Common value doesnt exists")
    

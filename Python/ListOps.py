l1=[1,2,3,4,5]
l2=[1,3,4,9]
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
    

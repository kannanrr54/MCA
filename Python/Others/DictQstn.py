import operator
months={"Jan":30,"Feb":28,"Mar":31,"Apr":30,"May":31,"Jun":30,"Jul":31,"Aug":30,"Sep":31,"Oct":30,"Nov":31,"Dec":30}
print("enter the month short form to get the total no:of days")
s=input()
print(s ,"has ",months[s], "Days")
print("printing values in Aplbhabetical order of keys\n" ,sorted(months.items(),key=operator.itemgetter(0)))
print("printing values in Ascending order of Months\n" ,sorted(months.items()))
    


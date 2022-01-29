def title(fn1,fn2):
    x = open(fn1, "r")
    c = open(fn2,"w")
    a=x.readlines()
    print("First file : --")
    for i in a:
        c.write(i.title())
        print(i)
    c.close()
    x.close()
    print("------------------------------------------")
    print("Modified file : --")
    c = open(fn2,"r")
    p=c.readlines()
    for d in p:
        print(d)
#function call
title("txt.txt","copy.txt")
    




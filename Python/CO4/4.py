class time:
    def __init__(self,hour,minute,sec):
        self.__hour=hour
        self.__minute=minute
        self.__sec=sec
    def __add__(self,other):
       h=self.__hour+other.__hour
       m=self.__minute+other.__minute
       s=self.__sec+other.__sec
       return h,m,s
t1=time(1,2,3)
t2=time(2,1,1)
print(t1+t2)
    



        


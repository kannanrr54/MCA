import math
import datetime
class time:
    def __init__(self,hour,minute,sec):
        self.__hour=hour
        self.__minute=minute
        self.__sec=sec
    def __add__(self,other):
        s1 = datetime.timedelta(hours=self.__hour, minutes=self.__minute, seconds=self.__sec)
        s2 = datetime.timedelta(hours=other.__hour, minutes=other.__minute, seconds=other.__sec)
        return s1+s2
t1=time(60,2,60)
t2=time(72,1,1)
print(t1+t2)
    



        


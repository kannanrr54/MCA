class publisher:
    def __init__(self,name):
        self.name=name
    def display(self):
        print("Publisher :",self.name)
class book(publisher):
    def __init__(self,name,title,author):
        publisher.__init__(self,name)
        self.title=title
        self.author=author
    def display(self):
        print("Publisher :",self.name,"title : ",self.title,"author :",self.author)
class python(book):
    def __init__(self,name,title,author,price,page):
        book.__init__(self,name,title,author)
        self.price=price
        self.page=page
    def display(self):
        print("Publisher :",self.name,"title : ",self.title,"author :",self.author,"Price :",self.price,"Pages : ",self.page)
a=publisher("A")
b=book("A","CPP","bala")
c=python("A","Py","X","100","10")
a.display()
b.display()
c.display()



    



        


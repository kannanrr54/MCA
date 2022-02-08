class Bank:

    def __init__(
        self,
        num,
        name,
        typeofac,
        bal,
        ):
        self.name = name
        self.num = num
        self.typeofac = typeofac
        self.bal = bal

    def deposit(self, amt):
        bal = self.bal + amt
        print ('new balance :', bal)

    def withdraw(self, amt):
        bal = self.bal - amt
        print ('new balance :', bal)


d = Bank(100, 'Kannan', 'Savings', 10000)
print ('Depositing 100 rs', d.deposit(100))
print ('Withdrawing 100 rs', d.withdraw(100))

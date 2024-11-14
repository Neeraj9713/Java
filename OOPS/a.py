class student:
    def __init__(self,name):
        self.name = name
        print(self.name)

    def mathe(self,a,b):
        print(a+b)

class employee(student):
    def __init__(self,name):
        self.name = name
        print(self.name)

    def ma(self,a,b):
        print(a-b)

parent = student("lahar")
child =  employee("mayur")     
child.ma(2,3)
child.mathe(4,5)



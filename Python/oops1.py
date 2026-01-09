class student:
 def __init__ (self,Roll,name,phone):
    self.Roll= Roll
    self.name= name
    self.phone= phone


 def setp(self,value):
  self.phone= value

 def prints(self):
  print(f"The number is{self.phone}")
   

#2=student()
f2 = student(1,"goury",123)

f2.prints()
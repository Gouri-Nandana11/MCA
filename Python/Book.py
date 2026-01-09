class Book:
    def __init__(self,title,author):
        self.title=title
        self.author=author

b1=Book("noteBook","nsk")
b1.publisher="abc"
if hasattr(b1,"publisher"):
      print(f"{b1.title} written by{b1.author} is published by{b1.publisher}")      
else:
     print("unknown")
              
    

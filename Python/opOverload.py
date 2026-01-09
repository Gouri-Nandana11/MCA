class Rectangle:
    def __init__(self, length, width):
        self._length = length
        self._width = width
    
    def area(self):
      return  self._length *self._width

    def __lt__(self, other):  # Overload '>'
        return self.area() < other.area()
    def __str__(self):
        return f"rectangle {self._length}*{self._width} Area: {self.area()}"

r1 = Rectangle(5, 6)
r2 = Rectangle(7, 4)

print(r1)
print(r2)

if r1 < r2:
    print("Rectangle 1 is smaller than Rectangle 2.")
else:
    print("Rectangle 1 is larger  Rectangle 2.")

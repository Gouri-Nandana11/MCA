# Base class 1
class Engine:
    def __init__(self, engine_type, horsepower):
        self.engine_type = engine_type
        self.horsepower = horsepower

    def display(self):
        print("Engine Type:", self.engine_type)
        print("Horsepower:", self.horsepower)


# Base class 2
class Wheels:
    def __init__(self, num_wheels, wheel_type):
        self.num_wheels = num_wheels
        self.wheel_type = wheel_type

    def display(self):
        print("Number of Wheels:", self.num_wheels)
        print("Wheel Type:", self.wheel_type)


# Derived class
class Car(Engine, Wheels):
    def __init__(self, engine_type, horsepower, num_wheels, wheel_type, brand, model):
        # Initialize parent classes
        Engine.__init__(self, engine_type, horsepower)
        Wheels.__init__(self, num_wheels, wheel_type)
        self.brand = brand
        self.model = model

    # Method overriding
    def display(self):
        print("Car Details:")
        print("Brand:", self.brand)
        print("Model:", self.model)
        # Call parent display methods
        Engine.display(self)
        Wheels.display(self)


# Example usage
c1 = Car("Petrol", 120, 4, "Alloy", "Toyota", "Corolla")
c1.display()

class Bank:
    def __init__(self, name, actNo, balance, acc_type):
        self.name = name
        self.actNo = actNo
        self.balance = balance
        self.acc_type = acc_type

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"₹{amount} deposited successfully.")
        else:
            print("Deposit amount must be positive.")

    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient balance.")
        elif amount <= 0:
            print("Withdrawal amount must be positive.")
        else:
            self.balance -= amount
            print(f"₹{amount} withdrawn successfully.")

    def display(self):
        print("\n--- Account Details ---")
        print(f"Account Holder: {self.name}")
        print(f"Account Number: {self.actNo}")
        print(f"Account Type: {self.acc_type}")
        print(f"Balance: ₹{self.balance}")


# Example usage
acc1 = Bank("Aarav Sharma", 123456, 5000, "Savings")

acc1.display()
acc1.deposit(1500)
acc1.withdraw(2000)
acc1.display()

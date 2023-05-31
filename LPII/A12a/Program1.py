# Stock Market Trading System

# Stock data
stocks = []

# Function to add a new stock
def add_stock():
    print("Enter stock details:")
    symbol = input("Symbol: ")
    name = input("Name: ")
    price = float(input("Price: "))
    quantity = int(input("Quantity: "))
    stock = {
        "Symbol": symbol,
        "Name": name,
        "Price": price,
        "Quantity": quantity
    }
    stocks.append(stock)
    print("Stock added successfully!")

# Function to search for a stock
def search_stock():
    symbol = input("Enter stock symbol to search: ")
    for stock in stocks:
        if stock["Symbol"] == symbol:
            print("Stock found:")
            print("Symbol:", stock["Symbol"])
            print("Name:", stock["Name"])
            print("Price:", stock["Price"])
            print("Quantity:", stock["Quantity"])
            return
    print("Stock not found!")

# Function to buy a stock
def buy_stock():
    symbol = input("Enter stock symbol to buy: ")
    for stock in stocks:
        if stock["Symbol"] == symbol:
            quantity = int(input("Enter quantity to buy: "))
            if quantity <= stock["Quantity"]:
                stock["Quantity"] -= quantity
                print("Stock bought successfully!")
                return
            else:
                print("Insufficient quantity!")
                return
    print("Stock not found!")

# Function to sell a stock
def sell_stock():
    symbol = input("Enter stock symbol to sell: ")
    for stock in stocks:
        if stock["Symbol"] == symbol:
            quantity = int(input("Enter quantity to sell: "))
            stock["Quantity"] += quantity
            print("Stock sold successfully!")
            return
    print("Stock not found!")

# Function to display all stocks
def display_stocks():
    if len(stocks) == 0:
        print("No stocks found!")
    else:
        print("Stock details:")
        for stock in stocks:
            print("Symbol:", stock["Symbol"])
            print("Name:", stock["Name"])
            print("Price:", stock["Price"])
            print("Quantity:", stock["Quantity"])
            print("-" * 20)

# Main program loop
while True:
    print("\nStock Market Trading System")
    print("1. Add Stock")
    print("2. Search Stock")
    print("3. Buy Stock")
    print("4. Sell Stock")
    print("5. Display Stocks")
    print("6. Quit")
    choice = input("Enter your choice (1-6): ")

    if choice == "1":
        add_stock()
    elif choice == "2":
        search_stock()
    elif choice == "3":
        buy_stock()
    elif choice == "4":
        sell_stock()
    elif choice == "5":
        display_stocks()
    elif choice == "6":
        print("Thank you for using the Stock Market Trading System. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")


# Employee Management System

# Employee records
employees = []

# Function to add a new employee
def add_employee():
    print("Enter employee details:")
    name = input("Name: ")
    emp_id = input("ID: ")
    position = input("Position: ")
    employee = {
        "Name": name,
        "ID": emp_id,
        "Position": position
    }
    employees.append(employee)
    print("Employee added successfully!")

# Function to search for an employee
def search_employee():
    emp_id = input("Enter employee ID to search: ")
    for employee in employees:
        if employee["ID"] == emp_id:
            print("Employee found:")
            print("Name:", employee["Name"])
            print("ID:", employee["ID"])
            print("Position:", employee["Position"])
            return
    print("Employee not found!")

# Function to delete an employee
def delete_employee():
    emp_id = input("Enter employee ID to delete: ")
    for employee in employees:
        if employee["ID"] == emp_id:
            employees.remove(employee)
            print("Employee deleted successfully!")
            return
    print("Employee not found!")

# Function to update an employee's details
def update_employee():
    emp_id = input("Enter employee ID to update: ")
    for employee in employees:
        if employee["ID"] == emp_id:
            print("Enter new employee details:")
            employee["Name"] = input("Name: ")
            employee["Position"] = input("Position: ")
            print("Employee details updated successfully!")
            return
    print("Employee not found!")

# Function to display all employees
def display_employees():
    if len(employees) == 0:
        print("No employees found!")
    else:
        print("Employee details:")
        for employee in employees:
            print("Name:", employee["Name"])
            print("ID:", employee["ID"])
            print("Position:", employee["Position"])
            print("-" * 20)

# Main program loop
while True:
    print("\nEmployee Management System")
    print("1. Add Employee")
    print("2. Search Employee")
    print("3. Delete Employee")
    print("4. Update Employee Details")
    print("5. Display Employees")
    print("6. Quit")
    choice = input("Enter your choice (1-6): ")

    if choice == "1":
        add_employee()
    elif choice == "2":
        search_employee()
    elif choice == "3":
        delete_employee()
    elif choice == "4":
        update_employee()
    elif choice == "5":
        display_employees()
    elif choice == "6":
        print("Thank you for using the Employee Management System. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")


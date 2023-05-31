def add_employee(employees):
    employee_id = input("Enter employee ID: ")
    name = input("Enter employee name: ")
    position = input("Enter employee position: ")
    employees[employee_id] = {
        'name': name,
        'position': position
    }
    print("Employee added successfully!")

def delete_employee(employees):
    employee_id = input("Enter employee ID to delete: ")
    if employee_id in employees:
        del employees[employee_id]
        print("Employee deleted successfully!")
    else:
        print("Employee not found!")

def update_employee(employees):
    employee_id = input("Enter employee ID to update: ")
    if employee_id in employees:
        name = input("Enter new name: ")
        position = input("Enter new position: ")
        employees[employee_id]['name'] = name
        employees[employee_id]['position'] = position
        print("Employee updated successfully!")
    else:
        print("Employee not found!")

def display_employees(employees):
    print("Employee List:")
    print("--------------")
    for employee_id, employee in employees.items():
        print("ID:", employee_id)
        print("Name:", employee['name'])
        print("Position:", employee['position'])
        print("--------------")

def main():
    employees = {}
    while True:
        print("\nEmployee Management System")
        print("1. Add Employee")
        print("2. Delete Employee")
        print("3. Update Employee")
        print("4. Display Employees")
        print("5. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            add_employee(employees)
        elif choice == '2':
            delete_employee(employees)
        elif choice == '3':
            update_employee(employees)
        elif choice == '4':
            display_employees(employees)
        elif choice == '5':
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == '__main__':
    main()


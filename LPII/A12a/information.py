# Information Management System

# Information records
information = []

# Function to add a new information record
def add_information():
    print("Enter information details:")
    title = input("Title: ")
    description = input("Description: ")
    date = input("Date: ")
    info = {
        "Title": title,
        "Description": description,
        "Date": date
    }
    information.append(info)
    print("Information added successfully!")

# Function to search for an information record
def search_information():
    title = input("Enter information title to search: ")
    for info in information:
        if info["Title"].lower() == title.lower():
            print("Information found:")
            print("Title:", info["Title"])
            print("Description:", info["Description"])
            print("Date:", info["Date"])
            return
    print("Information not found!")

# Function to delete an information record
def delete_information():
    title = input("Enter information title to delete: ")
    for info in information:
        if info["Title"].lower() == title.lower():
            information.remove(info)
            print("Information deleted successfully!")
            return
    print("Information not found!")

# Function to update an information record's details
def update_information():
    title = input("Enter information title to update: ")
    for info in information:
        if info["Title"].lower() == title.lower():
            print("Enter new information details:")
            info["Description"] = input("Description: ")
            info["Date"] = input("Date: ")
            print("Information details updated successfully!")
            return
    print("Information not found!")

# Function to display all information records
def display_information():
    if len(information) == 0:
        print("No information records found!")
    else:
        print("Information details:")
        for info in information:
            print("Title:", info["Title"])
            print("Description:", info["Description"])
            print("Date:", info["Date"])
            print("-" * 20)

# Main program loop
while True:
    print("\nInformation Management System")
    print("1. Add Information")
    print("2. Search Information")
    print("3. Delete Information")
    print("4. Update Information Details")
    print("5. Display Information")
    print("6. Quit")
    choice = input("Enter your choice (1-6): ")

    if choice == "1":
        add_information()
    elif choice == "2":
        search_information()
    elif choice == "3":
        delete_information()
    elif choice == "4":
        update_information()
    elif choice == "5":
        display_information()
    elif choice == "6":
        print("Thank you for using the Information Management System. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")


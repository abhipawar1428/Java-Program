# IHospitals and Medical Facilities System

# Hospital records
hospitals = []

# Facility records
facilities = []

# Function to add a new hospital
def add_hospital():
    print("Enter hospital details:")
    name = input("Name: ")
    location = input("Location: ")
    services = input("Services Provided: ")
    hospital = {
        "Name": name,
        "Location": location,
        "Services": services
    }
    hospitals.append(hospital)
    print("Hospital added successfully!")

# Function to search for a hospital
def search_hospital():
    name = input("Enter hospital name to search: ")
    for hospital in hospitals:
        if hospital["Name"].lower() == name.lower():
            print("Hospital found:")
            print("Name:", hospital["Name"])
            print("Location:", hospital["Location"])
            print("Services Provided:", hospital["Services"])
            return
    print("Hospital not found!")

# Function to delete a hospital
def delete_hospital():
    name = input("Enter hospital name to delete: ")
    for hospital in hospitals:
        if hospital["Name"].lower() == name.lower():
            hospitals.remove(hospital)
            print("Hospital deleted successfully!")
            return
    print("Hospital not found!")

# Function to add a new medical facility
def add_facility():
    print("Enter facility details:")
    name = input("Name: ")
    location = input("Location: ")
    services = input("Services Provided: ")
    facility = {
        "Name": name,
        "Location": location,
        "Services": services
    }
    facilities.append(facility)
    print("Medical facility added successfully!")

# Function to search for a medical facility
def search_facility():
    name = input("Enter facility name to search: ")
    for facility in facilities:
        if facility["Name"].lower() == name.lower():
            print("Medical facility found:")
            print("Name:", facility["Name"])
            print("Location:", facility["Location"])
            print("Services Provided:", facility["Services"])
            return
    print("Medical facility not found!")

# Function to delete a medical facility
def delete_facility():
    name = input("Enter facility name to delete: ")
    for facility in facilities:
        if facility["Name"].lower() == name.lower():
            facilities.remove(facility)
            print("Medical facility deleted successfully!")
            return
    print("Medical facility not found!")

# Function to display all hospitals
def display_hospitals():
    if len(hospitals) == 0:
        print("No hospitals found!")
    else:
        print("Hospital details:")
        for hospital in hospitals:
            print("Name:", hospital["Name"])
            print("Location:", hospital["Location"])
            print("Services Provided:", hospital["Services"])
            print("-" * 20)

# Function to display all medical facilities
def display_facilities():
    if len(facilities) == 0:
        print("No medical facilities found!")
    else:
        print("Medical facility details:")
        for facility in facilities:
            print("Name:", facility["Name"])
            print("Location:", facility["Location"])
            print("Services Provided:", facility["Services"])
            print("-" * 20)

# Main program loop
while True:
    print("\nIHospitals and Medical Facilities System")
    print("1. Add Hospital")
    print("2. Search Hospital")
    print("3. Delete Hospital")
    print("4. Add Medical Facility")
    print("5. Search Medical Facility")
    print("6. Delete Medical Facility")
    print("7. Display Hospitals")
    print("8. Display Medical Facilities")
    print("9. Quit")
    choice = input("Enter your choice (1-9): ")

    if choice == "1":
        add_hospital()
    elif choice == "2":
        search_hospital()
    elif choice == "3":
        delete_hospital()
    elif choice == "4":
        add_facility()
    elif choice == "5":
        search_facility()
    elif choice == "6":
        delete_facility()
    elif choice == "7":
        display_hospitals()
    elif choice == "8":
        display_facilities()
    elif choice == "9":
        print("Thank you for using the IHospitals and Medical Facilities System. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")

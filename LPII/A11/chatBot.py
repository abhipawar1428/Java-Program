import tkinter as tk

# Function to provide a response based on user input
def respond():
    user_input = entry.get()
    if "order" in user_input:
        response = "Sure! How can I help you with your order?"
    elif "track" in user_input and "order" in user_input:
        response = "Please provide your order tracking number."
    elif "refund" in user_input:
        response = "I'm sorry to hear that. Please provide more details about your refund request."
    elif "speak" in user_input and "representative" in user_input:
        response = "I can connect you to a representative. Please hold on for a moment."
    elif "bye" in user_input:
        response = "Thank you for contacting us. Have a great day!"
        entry.config(state=tk.DISABLED)  # Disable entry field after goodbye
    else:
        response = "I'm sorry, but I couldn't understand your request. How else may I assist you?"

    conversation.insert(tk.END, "User: " + user_input + "\n")
    conversation.insert(tk.END, "Chatbot: " + response + "\n\n")
    entry.delete(0, tk.END)  # Clear the entry field

# Create the GUI window
window = tk.Tk()
window.title("Customer Chatbot")

# Create the conversation display
conversation = tk.Text(window, height=10, width=50)
conversation.pack(padx=10, pady=10)

# Create the user input field
entry = tk.Entry(window, width=50)
entry.pack(padx=10, pady=10)

# Create the send button
send_button = tk.Button(window, text="Send", command=respond)
send_button.pack(padx=10, pady=10)

# Run the GUI window
window.mainloop()

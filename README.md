# 💬 Chat Mediator System

A lightweight implementation of the **Mediator Design Pattern** in Java, enabling structured communication between users without direct dependency on each other.

---

## ✨ Features

- Implements the **Mediator Design Pattern** cleanly.
- Allows users to send and receive messages without tight coupling.
- Simple and scalable — easy to extend with more features like private messages or group chats.
- Great for educational purposes or lightweight applications.

---

## ⚙️ Requirements

- Java 8 or higher
- A basic Java IDE (like IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

---

## 📦 Installation

```bash
# 1. Clone the repository
git clone https://github.com/your-username/chat-mediator.git

# 2. Navigate to the project directory
cd chat-mediator

# 3. Compile the Java files
javac *.java

# 4. Run the application
java Main
```

---

## 🏗️ Project Structure

```bash
chat-mediator/
️️👉 ChatMediator.java     # Concrete Mediator class
️️👉 ChatUser.java          # Concrete User implementation
️️👉 IMediator.java         # Mediator Interface
️️👉 User.java              # Abstract User class
️️👉 Main.java              # Main driver to run the chat simulation
️️👉 *.class                # Compiled Java classes (after build)
️️👉 README.md              # Project documentation
```

---

## 🚀 Usage

After compiling and running `Main.java`, the program simulates a small chat:
- Users send messages through a mediator.
- All users receive the message except the sender.
- Console output shows sending and receiving clearly.

Example output:

```plaintext
X sent: Hi everyone!
Y received: Hi everyone!
Z received: Hi everyone!
Y sent: Hi X!
X received: Hi X!
Z received: Hi X!
```

---

## 🔮 Future Enhancements

- ✅ Add support for private messaging.
- ✅ Implement user status (Online/Offline).
- ✅ Create a basic GUI using JavaFX or Swing.
- ✅ Expand to support chat rooms.

---



 

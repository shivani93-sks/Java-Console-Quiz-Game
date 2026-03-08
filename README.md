# 🎮 Java Console Quiz Game

A **console-based quiz application built using Java** that allows users to test their knowledge by selecting a topic and difficulty level.
The program loads questions from external text files, displays them in the terminal, checks the answers entered by the user, and calculates the final score.

---

## 📌 Features

* Topic-based quizzes (Java, Python, C, JavaScript)
* Multiple difficulty levels (Easy, Moderate, Hard)
* Interactive command-line interface
* Automatic answer validation
* Final score calculation
* Questions loaded dynamically from external text files
* Error handling for invalid input

---

## 🛠 Technologies Used

* **Java**
* **File Handling** (`BufferedReader`, `FileReader`)
* **Collections Framework** (`ArrayList`)
* **Object-Oriented Programming (OOP)**
* **Exception Handling** (including Suppressed Exceptions)
* **Scanner Class** for user input

---

## 📂 Project Structure

```
Quiz-Game-Project
│
└── main
    │
    ├── Main.java
    ├── Question.java
    │
    └── source
        ├── allTopics.txt
        ├── allDifficulties.txt
        ├── Java.txt
        ├── Python.txt
        ├── C.txt
        └── JavaScript.txt
```

---

## ⚙️ How It Works

1. The program loads all available **quiz topics** and **difficulty levels** from text files.
2. The user selects a **topic** and **difficulty level** from the console.
3. The application reads questions from the corresponding **topic text file**.
4. Questions are filtered based on the **selected difficulty level**.
5. Each question is displayed with **four options (A, B, C, D)**.
6. The user enters their answer through the console.
7. The program validates the answers and calculates the **final score**.

---

## ▶️ Example Output

```
WELCOME TO THE QUIZ GAME

Select Topic → C
Select Difficulty → Hard

Question 1:
Which of the following is not a storage class in C?

A. auto
B. static
C. register
D. mutable

Enter your answer: D

QUIZ FINISHED
Final Score: 4/5
```

---

## 🚀 Future Improvements

* Random question selection
* Timer-based quiz system
* Graphical User Interface (GUI) version
* Score history tracking
* More quiz topics and questions

---

## 👩‍💻 Author

**Shivani Shroff**

Java Developer | Learning Data Structures & Object-Oriented Programming

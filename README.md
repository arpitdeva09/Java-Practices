# ☕ Java Programs

Welcome to my **Java Programs** repository! 👋

This repository contains simple Java programs for beginners who are learning Java programming.

If you are new to coding or Java, don't worry! This README will help you understand how to download, open, and run these Java programs using **IntelliJ IDEA**.

---

## 📌 About This Repository

This repository contains Java programs based on basic programming concepts such as:

* Hello World
* Variables
* Input and Output
* If-Else
* Switch
* For Loop
* While Loop
* Do-While Loop
* Arrays
* Strings
* Methods
* Classes and Objects
* Object-Oriented Programming
* Number Programs
* Pattern Programs
* Searching and Sorting
* And more beginner-friendly programs

---

# 💻 How to Run These Programs in IntelliJ IDEA

## Step 1: Install Java JDK

Before running Java programs, you need a **JDK (Java Development Kit)** installed on your computer.

You can check whether Java is installed by opening Command Prompt and typing:

```bash
java -version
```

If Java is installed, you should see the Java version.

If you don't have a JDK, install one and then configure it in IntelliJ IDEA.

---

## Step 2: Install IntelliJ IDEA

Download and install **IntelliJ IDEA**.

After installing it, open IntelliJ IDEA.

---

# 📂 Step 3: Download This Repository

You have two simple options.

### Option 1 — Download ZIP

1. Open this GitHub repository.
2. Click the **Code** button.
3. Click **Download ZIP**.
4. Extract the ZIP file.
5. Open IntelliJ IDEA.

### Option 2 — Clone the Repository

If you know Git, you can clone the repository using:

```bash
git clone <repository-url>
```

---

# 🏗️ Step 4: Open the Project in IntelliJ IDEA

In IntelliJ IDEA:

1. Click **Open**.
2. Select the downloaded repository folder.
3. Click **OK**.
4. Wait for IntelliJ IDEA to load the project.

If IntelliJ asks you to select a JDK, choose an installed JDK.

---

# ☕ Step 5: Open a Java Program

Look at the **Project** panel on the left side.

Find the `.java` file you want to run.

For example:

```text
HelloWorld.java
```

Open the file.

A simple Java program may look like this:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
```

---

# ▶️ Step 6: Run the Program

Look for the green **▶ Run** button next to the `main()` method.

Click:

**▶ → Run 'HelloWorld.main()'**

IntelliJ IDEA will compile and run the program.

The output will appear in the **Run** window at the bottom.

Example:

```text
Hello World

Process finished with exit code 0
```

An exit code of `0` normally means the program finished successfully.

---

# ⌨️ Running Programs That Take Input

Some programs require you to enter information.

For example:

```java
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}
```

After clicking **Run**, look at the **Run/Console** window.

You can type your input there.

Example:

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

---

# ⚠️ Common Problems

## 1. "Cannot find symbol"

This usually means Java cannot find a variable, method, class, or other name used in your program.

Check:

* Spelling
* Capital letters
* Missing semicolons
* Missing brackets

---

## 2. No Green Run Button

Make sure your Java class contains:

```java
public static void main(String[] args)
```

This is the normal entry point for a Java application.

---

## 3. JDK Not Configured

If IntelliJ says that no JDK is configured:

Go to:

**File → Project Structure → Project → SDK**

Then select an installed JDK.

---

## 4. Class Name Error

The public class name should match the Java file name.

For example:

```text
HelloWorld.java
```

should contain:

```java
public class HelloWorld
```

Not:

```java
public class Hello
```

---

# 📁 Understanding the Files

You may see files arranged like this:

```text
Java-Programs
│
├── README.md
│
├── HelloWorld.java
├── EvenOdd.java
├── PrimeNumber.java
├── Fibonacci.java
├── Factorial.java
├── Armstrong_Number.java
├── Array_Smallest_Element.java
├── Menu_Driven_Claculator.java
├── Two_matrix_Sum.java
└── ...
```

Open the `.java` file you want to learn or execute.

---

# 🧑‍💻 Beginner Tip

If you are completely new to Java, don't just copy and run the programs.

Try this:

1. Read the program.
2. Understand each line.
3. Run the program.
4. Enter different inputs.
5. Change something in the code.
6. Run it again.
7. See what changes.

This is a great way to learn programming.

---

# 📚 Recommended Learning Order

If you are learning Java from the beginning, try the programs in this order:

```text
1. Hello World
2. Variables
3. Input / Output
4. Operators
5. If-Else
6. Switch
7. For Loop
8. While Loop
9. Do-While Loop
10. Patterns
11. Arrays
12. Strings
13. Methods
14. Classes & Objects
15. Constructors
16. Inheritance
17. Polymorphism
18. Encapsulation
19. Abstraction
20. Searching & Sorting
```

---

# ⭐ About This Repository

This repository is created for **learning and practicing Java programming**.

The programs are kept simple and beginner-friendly so that students can understand the basic concepts of Java.

---

## 👨‍💻 Author

**Arpit Deva**

GitHub: **[@arpitdeva09](https://github.com/arpitdeva09)**

---

## ⭐ If This Repository Helps You

If you find these Java programs useful, consider giving this repository a ⭐ star on GitHub.

It motivates me to add more programs and learning resources.

---

# 🙌 Thanks for Visiting!

Happy Coding! ☕💻

**Keep Learning • Keep Practicing • Keep Coding**

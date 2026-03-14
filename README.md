# Splitwise Expense Settlement (Java)

A simple Java console application that simulates **Splitwise-style expense settlement**.
The program calculates how to settle expenses between a group of people with **minimum transactions**.

This project focuses on implementing the **Greedy Algorithm** to match the person who owes the most money with the person who should receive the most money.

---

## Problem

When a group of friends shares expenses, it becomes difficult to calculate:

* Who owes money
* Who should receive money
* How to minimize the number of payments required

This project solves that problem by computing the **optimal settlement transactions**.

---

## Features

* User input for participants
* Record multiple expenses
* Automatic calculation of equal share
* Calculates net balance for each person
* Determines **who should pay whom**
* Minimizes number of transactions using a **Greedy approach**

---

## Technologies Used

* Java
* Java Collections (HashMap, ArrayList)
* Greedy Algorithm
* Console based input/output

---

## Project Structure

```
SplitwiseSettlement.java
README.md
```

---

## How the Algorithm Works

1. Users enter the number of participants.
2. Users record expenses and who paid them.
3. The program calculates the **total expense**.
4. Each person's **equal share** is calculated.
5. Net balances are computed:

   * Positive value → person should receive money
   * Negative value → person owes money
6. The algorithm repeatedly:

   * Finds the **maximum creditor**
   * Finds the **maximum debtor**
   * Settles the largest possible amount between them

This continues until all balances become **0**.

---

## Example Input

```
Enter number of people: 3

Enter name: Alice
Enter name: Bob
Enter name: Charlie

Enter number of expenses: 3

Expense 1
Who paid: Alice
Amount: 20

Expense 2
Who paid: Alice
Amount: 5

Expense 3
Who paid: Bob
Amount: 10
```

---

## Example Output

```
Each person should pay: 11.67

Settlement:

Bob needs to pay Alice : 1.67
Charlie needs to pay Alice : 11.67
```

---

## Code Snippet

```java
double amount = Math.min(maxCredit, -maxDebit);

System.out.println(debtor + " needs to pay " + creditor + " : " + amount);

balance.put(creditor, maxCredit - amount);
balance.put(debtor, maxDebit + amount);
```

This part of the code settles the **maximum possible debt** between the largest debtor and creditor.

---

## Screenshots

### Program Execution

Add your screenshot here:

```
docs/output.png
```

Example:

![Program Output](docs/output.png)

You can take a screenshot of the terminal after running the program and place it in the **docs folder**.

---

## How to Run the Project

Clone the repository

```
git clone https://github.com/yourusername/splitwise-settlement
```

Go to project folder

```
cd splitwise-settlement
```

Compile the program

```
javac SplitwiseSettlement.java
```

Run the program

```
java SplitwiseSettlement
```

---

## Learning Outcomes

Through this project I learned:

* How real-world problems can be solved using algorithms
* How to use Java Collections like HashMap
* Implementing Greedy algorithms
* Handling user input in Java
* Designing simple console-based applications

---

## Possible Improvements

Future improvements for this project:

* Support for group expense splitting
* Custom split ratios
* GUI version of the application
* Web-based version using Spring Boot
* Database storage for transactions

---

## Author

Your Name

GitHub: https://github.com/yourusername

---

## Summary

This project demonstrates a simple but practical implementation of an **expense settlement system** using Java and greedy algorithms. It highlights how algorithmic thinking can simplify financial calculations among groups.

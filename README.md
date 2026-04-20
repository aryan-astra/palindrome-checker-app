# Palindrome Checker App

A console-based Java application that validates whether a given string is a palindrome using various data structures and algorithms.

## Problem Statement

ii

**Course:** STEP Bootcamp — Semester 4  
**Student:** Aryan Shukla

---

## Repository Structure

Each branch contains the Java source file for that specific Use Case (UC). Branches are grouped by weekly submission.

---

## Week 1 — Branches: `UC1` to `UC7`
*(Assigned: Feb 23)*

| Branch | Use Case | File | Description |
|--------|----------|------|-------------|
| `UC1`  | Application Entry & Welcome Message | `UseCase1PalindromeCheckerApp.java` | Displays app name and version at startup |
| `UC2`  | Hardcoded Palindrome Result | `UseCase2PalindromeCheckerApp.java` | Checks a hardcoded string for palindrome |
| `UC3`  | String Reverse | `UseCase3PalindromeCheckerApp.java` | Reverses string using a `for` loop |
| `UC4`  | Character Array Check | `UseCase4PalindromeCheckerApp.java` | Two-pointer technique on a `char[]` |
| `UC5`  | Stack-Based Checker | `UseCase5PalindromeCheckerApp.java` | Uses Stack (LIFO) to reverse and compare |
| `UC6`  | Queue + Stack Checker | `UseCase6PalindromeCheckerApp.java` | Compares FIFO (Queue) vs LIFO (Stack) |
| `UC7`  | Deque-Based Checker | `UseCase7PalindromeCheckerApp.java` | Uses Deque to compare front and rear |

---

## Week 2 — Branches: `UC8` to `UC13`
*(Assigned: Mar 2)*

| Branch | Use Case | File | Description |
|--------|----------|------|-------------|
| `UC8`  | Linked List Checker | `UseCase8PalindromeCheckerApp.java` | Fast/slow pointer + in-place second-half reversal |
| `UC9`  | Recursive Checker | `UseCase9PalindromeCheckerApp.java` | Recursive character comparison |
| `UC10` | Case-Insensitive & Space-Ignored | `UseCase10PalindromeCheckerApp.java` | Normalizes string before checking |
| `UC11` | OOP Palindrome Service | `UseCase11PalindromeCheckerApp.java` | Encapsulated `PalindromeChecker` class |
| `UC12` | Strategy Pattern | `UseCase12PalindromeCheckerApp.java` | Pluggable algorithms via Strategy Pattern |
| `UC13` | Performance Comparison | `UseCase13PalindromeCheckerApp.java` | Benchmarks all approaches using `System.nanoTime()` |

---

## How to Run (Any Branch)

```bash
# 1. Switch to the desired branch
git checkout UC1

# 2. Navigate to the src folder
cd src

# 3. Compile
javac UseCase1PalindromeCheckerApp.java

# 4. Run
java UseCase1PalindromeCheckerApp
```

Replace `UseCase1` with the appropriate UC number (`UseCase2`, `UseCase3`, … `UseCase13`).

---

## Key Concepts Covered

- OOP fundamentals (Class, Main Method, Static, Encapsulation)
- Data Structures: String, `char[]`, Stack, Queue, Deque, Singly Linked List
- Algorithms: Two-pointer, Fast/Slow pointer, In-place reversal, Recursion
- Design Pattern: Strategy Pattern
- Performance analysis using `System.nanoTime()`

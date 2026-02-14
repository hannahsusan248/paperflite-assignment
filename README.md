# Paperflite Assignment – Java Solutions

This repository contains my solutions to the problem statements provided as part of the Paperflite technical assignment.

All solutions are implemented in Java with clean structure, proper naming conventions, and clear execution instructions.

---

## Prob.lems Implemented

### 1️. Single Number
**Problem:**  
Given an integer array where every element appears twice except for one, find the element that appears only once.

**Approach:**  
Used XOR operation to efficiently cancel out duplicate numbers.  
Time Complexity: O(n)  
Space Complexity: O(1)

**Sample Input:**
[2, 2, 1]


**Sample Output:**
1


---

### 2️.Smallest Possible Number After Removing K Digits
**Problem:**  
Given a non-negative integer represented as a string and an integer k, remove k digits from the number so that the new number is the smallest possible.

**Approach:**  
Used a greedy approach with a stack to remove larger digits when a smaller digit appears.  
Time Complexity: O(n)  
Space Complexity: O(n)

**Sample Input:**
num = "1432219", k = 3


**Sample Output:**
1219


---

### 3️.Word Pattern
**Problem:**  
Given a pattern and a string, determine if the string follows the same pattern.

**Approach:**  
Used two HashMaps to maintain one-to-one mapping between pattern characters and words.  
Time Complexity: O(n)  
Space Complexity: O(n)

**Sample Input:**
pattern = "abba"
str = "dog cat cat dog"


**Sample Output:**
true


---

## How to Run

### Option 1: Using Command Line

1. Compile:
javac *.java


2. Run:
java <ClassName>


Example:
java SingleNumber_Problem1


---

### Option 2: Using IDE
You can directly open the project in IntelliJ IDEA / Eclipse / VS Code and run the individual Java files.

---

## Assumptions
- Input values are valid as per problem constraints.
- Edge cases such as empty input are handled appropriately.
- No external libraries are used (only standard Java libraries).

---

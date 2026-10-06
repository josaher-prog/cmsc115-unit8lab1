# cmsc115-unit8lab1
# Unit 8 Lab 1: GitHub and JUnit

**Student Name:** Johel Hernandez
**GitHub Repository URL:** https://github.com/josaher-prog/cmsc115-unit8lab1

---

## Task Reflections

### Commit 2: Task 1 (getGrade)
* **Bug Identified:** The starter code swapped the return statements for score tiers ("Meets" for > 90 and "Exceeds" for > 80) and used strict `>` operators instead of inclusive `>=` bounds.
* **Fix Applied:** Restructured the conditional logic so scores `>= 90` return `"Exceeds"`, scores `>= 70` return `"Meets"`, and scores under 70 return `"Does Not Meet"`.

### Commit 3: Task 2 (sumEvenNumbers)
* **Bug Identified:** The accumulator `sum` was initialized to `1` instead of `0`, and the loop boundary `i <= values.length` triggered an `ArrayIndexOutOfBoundsException`.
* **Fix Applied:** Changed `sum` initialization to `0` and updated the loop termination condition to `i < values.length`.

### Commit 4: Task 3 (sumRange)
* **Bug Identified:** The loop condition `i < end` excluded the upper bound from the total sum calculation.
* **Fix Applied:** Changed the condition to `i <= end` to ensure the target end number is included in the sum calculation.

---

## Overall Reflection

### What was the most challenging part of this lab, and how did you overcome it?
The most challenging part was making sure each bug fix was isolated and matched with its exact commit step and message. I overcame this by making small code adjustments, immediately running the matching JUnit test class to verify, and committing before moving to the next task.

### How did using JUnit tests help you identify and fix bugs in the code?
JUnit tests immediately flagged failing assertions with expected vs. actual values, which made finding boundary errors and off-by-one loop conditions much faster than manually running main methods.

### Why is version control (Git/GitHub) an essential tool for software development?
Git and GitHub allow developers to track code changes, revert to working baseline states if something breaks, work on features in isolation, and maintain a clear history of how a codebase evolves.

# Java Algorithms Practice 

A collection of algorithmic problems in Java.
This project was created to practice skills to train logical thinking.

## 🔧 Stack
- Java 17+
- IntelliJ IDEA
- Pure Java Core

## 📁 Structure
Each folder `taskN` contains:
- Java-file with the task
- Method `main()`


##  Examples

### Weighted Random Picker (task6)
Chose the value based on its weight:

```java
String[] values = {"Common", "Rare", "Epic", "Legendary"};
int[] weights = {100, 25, 5, 1};
SpinArea picker = new SpinArea(values, weights);
System.out.println(picker.getRandomValue());

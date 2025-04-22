# Java Project: Maze Solver and Gray Code Encoder

This project was created as part of the "Grundlagen der Programmierung" course at Humboldt University of Berlin.

It consists of:

1. **MazeSolver.java** – A recursive maze pathfinder.
2. **MazeTester.java** – Provides test cases for the maze solver.
3. **Gray.java** – Converts numbers to and from Gray code.
4. **GrayTester.java** – Validates Gray code correctness.

## Original Assignment

The assignment description is available in `GdP_UE_5.pdf` (in German).

## How to Compile and Run

Make sure `gdp_stdlib.jar` is available.  
Compile all files with:

```bash
javac -cp .;gdp_stdlib.jar MazeSolver.java MazeTester.java Gray.java GrayTester.java
java -cp .;gdp_stdlib.jar MazeTester
java -cp .;gdp_stdlib.jar GrayTester
```

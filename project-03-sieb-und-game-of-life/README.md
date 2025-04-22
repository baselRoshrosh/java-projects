# Java Project: Prime Numbers and Conway's Game of Life

This project was developed as part of the "Grundlagen der Programmierung" course at Humboldt University of Berlin.

It consists of two programs:

1. **Sieb.java** – Implements the Sieve of Eratosthenes to find prime numbers.
2. **GameOfLife.java** – Simulates Conway's Game of Life using graphical output.

## Original Assignment

The task description is provided in `GdP_UE_3_.pdf` (in German).  
The folder also contains:
- `gdp_stdlib.jar` – Required standard library
- `GoLRessources.zip` – Sample input files for Game of Life

## How to Compile and Run

Make sure `gdp_stdlib.jar` is in the same folder, then compile:

```bash
javac -cp .;gdp_stdlib.jar Sieb.java GameOfLife.java
java -cp .;gdp_stdlib.jar Sieb 10
java -cp .;gdp_stdlib.jar GameOfLife < config_file.conf
```

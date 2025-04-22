# Java Project: Number System Conversion and Hamming Code Simulation

This project was created for the "Grundlagen der Programmierung" course at Humboldt University of Berlin.

It includes:

1. **A1.txt** – Answers to number system conversion exercises.
2. **encode.toy** – TOY assembly code for Hamming encoding.
3. **decode.toy** – TOY assembly code for decoding and error correction.
4. **hamming.zip** – Contains example input files and Java reference implementations.

## Original Assignment

The task description can be found in `Blatt06.pdf` (in German).

## Description

### A1.txt

- Contains five base conversion tasks:
  - Decimal to base-15
  - Base-5 to base-16
  - Base-9 to base-3
  - Two’s complement conversion (16-bit)
  - Hexadecimal signed value to decimal

### encode.toy and decode.toy

- These are programs written in TOY (a minimal assembly-like language).
- `encode.toy` implements Hamming (7,4) encoding.
- `decode.toy` performs single-bit error detection and correction.

### hamming.zip

- Includes test cases and Java programs (`HammingEncoder.java`, `HammingDecoder.java`) for comparison.
- Use these to verify the correctness of your TOY implementations.

## How to Run

You can simulate the TOY code using the command-line Toy interpreter provided by the course.

```bash
java Toy encode.toy < input_encoding.txt
java Toy decode.toy < input_decoding.txt
```
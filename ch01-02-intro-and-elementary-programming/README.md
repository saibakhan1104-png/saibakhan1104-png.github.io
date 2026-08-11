# Chapters 1 & 2: Introduction to Java + Elementary Programming

## Key concepts
- How Java programs are written, compiled (`javac`), and run (`java`) — source code → bytecode → JVM
- Structure of a basic Java program: `public class`, `main` method
- Variables, data types (`int`, `double`, `char`, `boolean`, etc.) and literals
- Reading input with `Scanner`
- Arithmetic, assignment, and increment/decrement operators
- Command-line arguments (`args[0]`, `args[1]`, ...)
- Formatting output with `DecimalFormat`

## What I built

| File | Description |
|---|---|
| `HelloWorld.java` | First Java program — prints a greeting |
| `ItsARainyDay.java` | Simple `println` practice |
| `DisplayPattern.java` | Prints a text pattern using `println` statements |
| `Rectangle.java` | Computes the area of a rectangle with fixed values, formatted output |
| `CommandLine.java` | Same rectangle-area calculation, but reads width/height from command-line arguments |
| `SeriesSum.java` | Reads a number `n` from input and prints the sum of 1 to `n` as a series (e.g. `1+2+3 = 6`) |
| `SimpleCalculator.java` | Interactive calculator supporting `+ - * /` with divide-by-zero handling |
| `MathPractice.java` | Five small math programs in one file: right-triangle height, compound interest, Cartesian→polar conversion, distance between two points, and solving a quadratic equation |

*(originally spread across separate repos — merged here as I learn to keep everything chapter-organized)*

## Notes / things that tripped me up
- *(e.g. "forgot integer division truncates — 5/2 gives 2, not 2.5")*
- *(e.g. "Scanner.nextInt() vs nextLine() — mixing them can skip input")*
- *(add your own notes here as you review this code)*

## How to run
```bash
cd src
javac SimpleCalculator.java
java SimpleCalculator
```

For `CommandLine.java`, pass width and height as arguments:
```bash
javac CommandLine.java
java CommandLine 4.5 7.9
```

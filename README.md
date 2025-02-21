# Smart Calculator(Kotlin)

## Stage 1/8: 2+2
In this stage, our calculator simply adds two integers numbers 
from the input, and prints out the result.

[Open stage on Hyperskill](https://hyperskill.org/projects/88/stages/486/implement)

Stage implementation: [addNumbers.kt](src/main/kotlin/calculator/addNumbers.kt)

**Example:**

    > 5 8
    13

## Stage 2/8: 2+2+

Now, the following modifications are added to our simple program from the previous stage:

- It reads two numbers in a loop and prints the sum in the standard output, until the user inputs `/exit`.

- If a user enters only a single number, the program prints the same number. 
- If a user enters an empty line, the program ignores it.
- When the exit command is entered, the program prints "Bye!", and terminates.
   
[Open stage on Hyperskill](https://hyperskill.org/projects/88/stages/487/implement)

Stage implementation: [lastingCalculator.kt](src/main/kotlin/calculator/lastingCalculator.kt)

**Example:**

    > 17 9
    26
    > -2 5
    3
    >
    > 7
    7
    > /exit
    Bye!
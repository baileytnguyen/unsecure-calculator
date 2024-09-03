# Unsecure Calculator

The **Unsecure Calculator** is a simple command-line-based calculator written in Java. It supports basic arithmetic operations, value storage, and retrieval. This project is intended for educational purposes is "unsecure".

## Features

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second.
- **Modulo**: Computes the remainder of dividing the first number by the second.
- **Store**: Stores the last result in memory.
- **Retrieve**: Retrieves the stored value.
- **Clear**: Clears the stored value.
- **Exit**: Exits the calculator.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Internet connection

## How to Compile and Run

1. **Clone the repository** or download the source files to your local machine.

2. **Navigate to the project directory**. Use a terminal or command prompt to navigate to the directory where the source files are located.

3. **Compile the Java files**.:

    ```bash
    ./gradlew build
    ```

4. **Run the program**. Execute the following command to start the calculator:

    ```bash
    ./gradlew run
    ```

## Usage

Once the program is running, you can type in commands to perform operations. Below are examples of the available commands:

- **Add**: Adds two numbers.  
    ```bash
    add 2 4
    ```
    Output: `Result: 6.0`

- **Subtract**: Subtracts the second number from the first.  
    ```bash
    subtract 5 3
    ```
    Output: `Result: 2.0`

- **Multiply**: Multiplies two numbers.  
    ```bash
    multiply 3 3
    ```
    Output: `Result: 9.0`

- **Divide**: Divides the first number by the second.  
    ```bash
    divide 10 2
    ```
    Output: `Result: 5.0`

- **Modulo**: Computes the remainder of dividing the first number by the second.  
    ```bash
    modulo 7 2
    ```
    Output: `Result: 1.0`

- **Store**: Stores the last result in memory.  
    ```bash
    store
    ```
    Output: `Stored value: 5.0`

- **Retrieve**: Retrieves the stored value.  
    ```bash
    retrieve
    ```
    Output: `Retrieved value: 5.0`

- **Clear**: Clears the stored value.  
    ```bash
    clear
    ```
    Output: `Stored value cleared.`

- **Exit**: Exits the calculator.  
    ```bash
    exit
    ```
    Output: `Exiting the calculator.`

## Example Session

```plaintext
Welcome to the Unsecure Calculator CLI!
Type 'exit' to quit.
> add 5 10
Result: 15.0
> store
Stored value: 15.0
> retrieve
Retrieved value: 15.0
> subtract 20 5
Result: 15.0
> multiply 3 5
Result: 15.0
> divide 15 3
Result: 5.0
> clear
Stored value cleared.
> exit
Exiting the calculator.
```

## Notes

- The program uses floating-point arithmetic, so results are displayed as floating-point numbers.

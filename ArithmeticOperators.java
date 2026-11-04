EXP.NO:2A
DATE:04-08-26
                    ARITHEMATIC OPERATIONS USING SWITCH CASE
Aim:
To perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using Java.

Algorithm:
1.	Read two numbers from the user.
2.	Display the arithmetic operation menu.
3.	Read the user's choice.
4.	Perform the selected operation using switch.
5.	Display the result.
6.	Repeat until the user selects Exit.
    
Code:
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
Output:
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 5

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result: 25

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
4
Result: 4.0

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
6
Exiting...
    
Result:
Thus, the program successfully performs the selected arithmetic operations on two numbers.

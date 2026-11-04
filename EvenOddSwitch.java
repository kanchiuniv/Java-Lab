EXP.NO:2B
DATE:04-08-26
                         EVEN (OR) ODD USING SWITCH CASE
Aim:
To check whether a given number is even or odd using a switch statement.
    
Algorithm:
1.	Read a number from the user.
2.	Find the remainder when the number is divided by 2.
3.	If the remainder is 0, the number is even.
4.	If the remainder is 1, the number is odd.
5.	Display the result.
    
Code:
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");


Output:
Enter a number: 25
This number is odd
    
Result:
Thus, the program successfully checks whether the given number is even or odd using switch.
        }
    }
}

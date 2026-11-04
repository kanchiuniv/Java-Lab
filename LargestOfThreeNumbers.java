EXP.NO:2C
DATE:04-08-26
                        LARGEST OF THREE NUMBERS
Aim:
To find the largest of three numbers using if-else statements.
    
Algorithm:
1.	Read three integers x, y, and z.
2.	Compare x with y and z.
3.	If x is largest, display the first number.
4.	Otherwise, compare y and z.
5.	Display the largest number or indicate if the numbers are equal.
    
Code:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
Output:
Enter three integers:
25 40 15
Second number is largest
    
Result:
Thus, the program successfully finds the largest of three numbers.

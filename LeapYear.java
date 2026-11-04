EXP.NO:2D
DATE:04-08-26
                              LEAP YEAR 
Aim:
To check whether a given year is a leap year or not.
    
Algorithm:
1.	Read the year from the user.
2.	Check if the year is divisible by 400.
3.	If not, check if it is divisible by 100.
4.	Otherwise, check if it is divisible by 4.
5.	Display whether the year is a leap year or not.
    
Code:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
Output:
Enter any year: 2024
Year 2024 is a leap year
    
Result:
Thus, the program successfully checks whether the given year is a leap year or not.
        s.close();
    }
}

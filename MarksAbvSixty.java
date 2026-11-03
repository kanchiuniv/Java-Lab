EXP NO:1(D)
DATE:28/7/26

            TO PRINT MARKS ABOVE 60
    
AIM:
To write and execute a Java program to read the names and marks of six students and display the names of students who scored more than 60 marks.

ALGORITHM:
1. Start the program.
2. Declare an integer array marks of size 6.
3. Declare a string array name of size 6.
4. Create a Scanner object to get input from the user.
5. Using a for loop, read the name and marks of six students.
6. Display the heading "Students scoring more than 60".
7. Using another for loop, check the marks of each student.
8. If the marks are greater than 60, display the student's name and marks.
9. Stop the program.

JAVA PROGRAM:
import java.util.Scanner;
public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

OUTPUT:
Enter Name of Student and Marks of Subject 1: Arun 85
Enter Name of Student and Marks of Subject 2: Banu 55
Enter Name of Student and Marks of Subject 3: Ravi 72
Enter Name of Student and Marks of Subject 4: Priya 60
Enter Name of Student and Marks of Subject 5: Kiran 90
Enter Name of Student and Marks of Subject 6: Divya 45

Students scoring more than 60:
Arun : 85
Ravi : 72

RESULT:Thus, the Java program to read the names and marks of six students and display the students who scored more than 60 marks was executed successfully.
Kiran : 90

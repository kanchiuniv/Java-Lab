EXP.NO:6
DATE:18-08-26
                              FIBONACCI SERIES
Aim:
To generate and display the Fibonacci series up to the given value of n.

Algorithm:
1.Start the program.
2.Read the value of n from the user.
3.If n is 0, display 0.
4.If n is 1, display 0 1.
5.Otherwise, initialize the first two Fibonacci numbers as 0 and 1.
6.Generate the next number by adding the previous two numbers.
7.Repeat the process until n terms are displayed.
8.Stop the program.
  
Code:
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
Output:
Enter the value of n: 8
0 1 1 2 3 5 8 13 21
  
Result:
Thus, the program successfully generates and displays the Fibonacci series for the given value of n.

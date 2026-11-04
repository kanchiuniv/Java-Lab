EXP.NO:5
DATE:18-08-26
                               ARMSTRONG NUMBER
Aim:
To check whether a given number is an Armstrong number or not.

Algorithm:
1.Read a positive number n.
2.Store the original number in nu.
3.Extract each digit using nu % 10.
4.Find the cube of each digit and add it to num.
5.Remove the last digit using nu / 10.
6.Repeat until all digits are processed.
7.Compare num with the original number n.
8.If equal, display Armstrong Number, otherwise display Not an Armstrong Number.
  
Code:
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
  Output:
Enter any Positive Number : 153
Armstrong Number
  
Result:
Thus, the program successfully checks whether the given number is an Armstrong number or not.
}
}


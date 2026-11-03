EXP NO:1A
DATE:28/7/26

          SORT IN ASCENDING ORDER      
  
AIM:
To write a Java program to sort the given array elements in ascending order using nested for loops and display the sorted array.
  
ALGORITHM:
1. Start the program.
2. Import the Scanner class to get input from the user.
3. Read the number of elements n from the user.
4. Create an integer array a of size n.
5. Read all the array elements from the user.
6. Compare each element with the remaining elements using nested for loops.
7. If a[i] is greater than a[j], swap the two elements using a temporary variable.
8. Repeat the process until all elements are arranged in ascending order.
9. Display the sorted array elements.
10. Stop the program.
  
JAVA PROGRAM:
import java.util.Scanner;
public class 
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of elements you want in array:");n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[j]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for (int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}

OUTPUT:
Enter number of elements you want in array:5
Enter all the elements:
45
12
78
23
9
AscendingOrder:9,12,23,45,78

  RESULT:
Thus, the Java program to sort the array elements in ascending order was executed successfully, and the sorted elements were displayed.

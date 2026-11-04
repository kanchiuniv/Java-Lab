EXP.NO:1C
DATE:28-07-26
             FINDING LARGEST AND SMALLEST NUMBER IN ARRAY
Aim:
To find the sum, largest, and smallest elements of an array using Java.
    
Algorithm:
1.	Initialize the array with elements.
2.	Set the first element as the initial min and max, and set sum = 0.
3.	Traverse through all the elements of the array.
4.	Add each element to sum.
5.	Compare each element with max and min to find the largest and smallest values.
6.	Display the sum, largest, and smallest elements.
    
Code:
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}

Output:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
    
Result:
Thus, the program successfully calculates the sum, largest element, and smallest element of the given array.

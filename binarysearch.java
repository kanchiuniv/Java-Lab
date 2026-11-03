EXP NO:1B
DATE:28/7/26

             BINARY SEARCH

AIM:
To write and execute a Java program to search for a given element in a sorted array using the Binary Search technique.

ALGORITHM:
1. Start the program.
2. Import the Scanner class to get input from the user.
3. Read the number of elements n.
4. Create an integer array a of size n.
5. Read the array elements in sorted order.
6. Read the element x to be searched.
7. Initialize first = 0 and last = n - 1.
8. Repeat the following steps while first <= last:
   - Calculate the middle position: mid = (first + last) / 2.
   - If a[mid] == x, set flag = 1, display the position of the element, and stop searching.
   - If a[mid] < x, set first = mid + 1.
   - Otherwise, set last = mid - 1.
9. If flag == 0, display "Element not found".
10. Stop the program.

JAVA PROGRAM:
import java.util.Scanner;
class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}

OUTPUT:ELEMENT FOUND
Enter number of elements: 5
Enter elements in sorted order:
10
20
30
40
50
Enter element to search: 30
Element found at position 3
    
OUTPUT:ELEMENT NOT FOUND
Enter number of elements: 5
Enter elements in sorted order:
10
20
30
40
50
Enter element to search: 25
Element not found
    
RESULT:
Thus, the Java program to search for an element in a sorted array using the Binary Search technique was executed successfully. The program displays the position of the element if it is found; otherwise, it displays "Element not found".



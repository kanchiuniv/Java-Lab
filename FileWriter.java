EXP NO:11(a)
DATE:29-09-26
                             FILE WRITER
Aim:
To write and execute a Java program to create a file and write the uppercase English alphabets (A–Z) into it using the `FileWriter` class.

Algorithm:
1. Start the program.
2. Import the `java.io` package.
3. Create a `FileWriter` object to open or create `sample2.txt`.
4. Use a `for` loop to generate characters from ASCII value 65 to 90.
5. Write each character into the file using `fw.write(i)`.
6. Close the file using `fw.close()`.
7. Handle exceptions using the `catch` block.
8. Stop the program.

Code:
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            Output:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

Result:
Thus, the Java program was executed successfully to create a file and write uppercase English alphabets from A to Z using the `FileWriter` class.
            System.out.println("Exception :" + e);
        }
    }
}

EXP NO:11(b)
DATE:29-09-26
                                    FILE READER
Aim:
To write and execute a Java program to read the contents of a file using the `FileReader` class.

Algorithm:
1. Start the program.
2. Import the `java.io` package.
3. Create a `FileReader` object to open the file `sample2.txt`.
4. Declare an integer variable `i`.
5. Read the file character by character using the `read()` method.
6. Continue reading until the end of the file (`-1`) is reached.
7. Convert each integer value into a character using `(char)i`.
8. Display each character using `System.out.println()`.
9. Close the file using `fr.close()`.
10. Handle exceptions using the `catch` block.
11. Stop the program.

Code:
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
  Output:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

Result:
Thus, the Java program was executed successfully to read and display the contents of `sample2.txt` using the `FileReader` class.
System.out.println("Exception:"+e);
}
}
}

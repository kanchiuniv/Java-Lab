EXP NO:3
DATE:11/8/26

             STRING OPERATIONS
    
AIM:
To write and execute a Java program to perform various string operations using the built-in methods of the String class.

ALGORITHM:
1. Start the program.
2. Declare and initialize a string variable str with the value "Hello Java".
3. Find and display the length of the string using length().
4. Display the character at index 1 using charAt().
5. Convert the string into uppercase using toUpperCase().
6. Convert the string into lowercase using toLowerCase().
7. Extract a substring using substring().
8. Concatenate another string using concat().
9. Check whether the string contains "Java" using contains().
10. Find the index of a character using indexOf().
11. Find the last index of a character using lastIndexOf().
12. Replace a substring using replace().
13. Check whether the string starts with "Hello" using startsWith().
14. Check whether the string ends with "Java" using endsWith().
15. Compare two strings using equals().
16. Remove leading and trailing spaces using trim().
17. Display all the results.
18. Stop the program.
    
JAVA PROGRAM:
    public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}

OUTPUT:
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java

RESULT:
Thus, the Java program to perform various string operations using the built-in methods of the String class was executed successfully.

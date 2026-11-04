EXP.NO:12(a)
DATE:13-10-26
                                   GRID LAYOUT
Aim:
To write a Java Applet program to create ten buttons using `GridLayout` arranged in 5 rows and 2 columns.

Algorithm:
1. Start the program.
2. Import the required AWT and Applet packages.
3. Create a class named `gld` that extends the `Applet` class.
4. Define the `init()` method.
5. Set the layout to `GridLayout(5, 2)`.
6. Create ten buttons labeled A, B, C, D, E, F, G, H, I, and J.
7. Add all ten buttons to the applet using the `add()` method.
8. Override the `getInsets()` method to set a 20-pixel margin on all sides.
9. Display the applet with the buttons arranged in 5 rows and 2 columns.
10. Stop the program.import java.awt.*;

Code:
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/
public class gld extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
Result: Thus, the Java Applet program to create ten buttons using `GridLayout` with 5 rows and 2 columns was executed successfully.

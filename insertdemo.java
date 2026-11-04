EXP NO:12(c)
DATE:13-10-26
                                  BORDER LAYOUT
Aim:
To write and execute a Java Applet program to demonstrate the use of `BorderLayout` in AWT.

Algorithm:
1. Start the program.
2. Import the required `java.awt`, `java.applet`, `java.io`, and `java.util` packages.
3. Create a class named `insertdemo` that extends the `Applet` class.
4. Override the `init()` method.
5. Set the background color to cyan using `setBackground(Color.cyan)`.
6. Set the layout manager to `BorderLayout`.
7. Add buttons to the five regions:
   - NORTH – Top button.
   - SOUTH – Bottom button.
   - EAST – Right button.
   - WEST – Left button.
   - CENTER – TextArea.
8. Override the `getInsets()` method to set a margin of 10 pixels on all sides.
9. Run the applet.
10. Stop the program.

Code:
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}

Result:
Thus, the Java Applet program was executed successfully to demonstrate the `BorderLayout` in AWT, which arranges components in five regions: NORTH, SOUTH, EAST, WEST, and CENTER.

EXP NO:12(d)
DATE:13-10-26
                              DRAWING LINE AND RECTANFLE USING APPLET
Aim:
To write and execute a Java Applet program to draw different lines and rectangles using the `Graphics` class.

Algorithm:
1. Start the program.
2. Import the required `java.awt`, `java.io`, and `java.applet` packages.
3. Create a class named `dinerect` that extends the `Applet` class.
4. Override the `paint(Graphics g)` method.
5. Use `drawLine()` to draw straight lines.
6. Use `drawRect()` to draw an outline rectangle.
7. Use `fillRect()` to draw a filled rectangle.
8. Use `drawRoundRect()` to draw a rounded rectangle.
9. Use `fillRoundRect()` to draw a filled rounded rectangle.
10. Execute the applet.
11. Stop the program.

Code:
import java.awt.*;
import java.io.*;
import java.applet.*;
/* <applet code="dinerect.class" width="300" height="200"> </applet>
*/
public class dinerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 10, 50, 50);

    g.drawRect(10, 60, 40, 30);
    g.fillRect(60, 10, 30, 80);

    g.drawRoundRect(10, 100, 80, 50, 10, 10);
    g.fillRoundRect(20, 110, 60, 30, 5, 5);

    g.drawLine(100, 10, 230, 140);
    g.drawLine(100, 140, 230, 10);
}
}

Result:
Thus, the Java Applet program was executed successfully to demonstrate drawing lines, rectangles, filled rectangles, and rounded rectangles using the `Graphics` class.   

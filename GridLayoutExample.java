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
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout Example");

        f.setLayout(new GridLayout(2, 3));

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));
        f.add(new JButton("Four"));
        f.add(new JButton("Five"));
        f.add(new JButton("Six"));

        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
Result: Thus, the Java Applet program to create ten buttons using `GridLayout` with 5 rows and 2 columns was executed successfully.

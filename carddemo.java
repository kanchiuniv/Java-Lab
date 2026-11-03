EXP NO:12(B)
DATE:13/10/26

           CARD LAYOUT
   
AIM:
To write and execute a Java Applet program using the CardLayout class to display different buttons one at a time when the user clicks on them.

ALGORITHM:
1. Start the program.
2. Import the required packages:
   - java.io.*
   - java.awt.*
   - java.applet.*
   - java.awt.event.*
3. Create a class carddemo that extends Applet and implements ActionListener.
4. Declare the required Button, Panel, and CardLayout objects.
5. In the init() method:
   - Create a Panel.
   - Add the Panel to the Applet.
   - Create a CardLayout object.
   - Set the CardLayout as the layout manager for the Panel.
   - Create three buttons: First Button, Second Button, and Third Button.
   - Register the ActionListener for each button.
   - Add the buttons to the Panel using CardLayout.
6. Define the actionPerformed() method.
7. When a button is clicked, call buttonCardLayout.next(buttonPanel) to display the next card.
8. Stop the program.

JAVA PROGRAM:
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

OUTPUT:
first Button

After clicking the first Button:

second Button

After clicking the second Button:

third button
  
RESULT:
Thus, the Java Applet program using the CardLayout class was executed successfully to display different buttons one at a time when clicked.

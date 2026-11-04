EXP.NO:7
DATE:18-08-26
                       INTERFACE PROGRAM
Aim:
To demonstrate the use of an interface in Java by implementing an interface in a class.

Algorithm:
1.Start the program.
2.Create an interface Animal with an abstract method sound().
3.Create a class Dog that implements the Animal interface.
4.Define the sound() method in the Dog class.
5.Create an object of the Dog class.
6.Call the sound() method using the object.
7.Display the output.
8.Stop the program.

Code:
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
Output:
Dog Barks
    
Result:
Thus, the program successfully demonstrates the implementation of an interface in Java.

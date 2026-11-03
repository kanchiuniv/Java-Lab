EXP NO:10(B)
DATE:15/9/26

               THREAD PRIORITY

AIM:
To write and execute a Java program to create multiple threads and set their priorities using the setPriority() method.

 ALGORITHM:
1. Start the program.
2. Create three thread classes A, B, and C by extending the Thread class.
3. Define the run() method in each thread class.
4. In thread A, print the thread name and numbers from 1 to 4.
5. In thread B, print the thread name and numbers from 1 to 4.
6. In thread C, print the thread name and numbers from 1 to 4.
7. Create objects for threads A, B, and C in the main method.
8. Set the priority of thread C to Thread.MAX_PRIORITY.
9. Set the priority of thread B to one greater than the priority of thread A.
10. Set the priority of thread A to Thread.MIN_PRIORITY.
11. Start all three threads using the start() method.
12. Display the message "end of main thread".
13. Stop the program

JAVA PROGRAM:
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}

OUTPUT:
start thread A
start thread B
start thread C
end of main thread
Thread A started
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
Thread B started
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread C started
thread c =1
thread c =2
thread c =3
thread c =4
exit from c

 RESULT:
Thus, the Java program to create multiple threads and set their priorities using the setPriority() method was executed successfully.

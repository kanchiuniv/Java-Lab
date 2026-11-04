EXP.NO:4
DATE:11-08-26
                               INHERITANCE
Aim:
To demonstrate different types of inheritance in Java: Single, Multilevel, Hierarchical, Multiple, and Hybrid Inheritance.

Algorithm:
1.	Create an Animal class and derive Dog from it for single inheritance.
2.	Derive Puppy from Dog for multilevel inheritance.
3.	Derive Cat from Animal for hierarchical inheritance.
4.	Create Father and Mother interfaces and implement both in Child for multiple inheritance.
5.	Create a Student class and implement the Sports interface in CollegeStudent for hybrid inheritance.
6.	Create objects and call the respective methods.
7.	Display the results.

CODE:
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}
class Student {
    void study() {
        System.out.println("Student studies");
    }
}
class CollegeStudent extends Student implements Sports {
    public void playSports() {
        System.out.println("College student plays sports");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println("\nMultiple Inheritance:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}

    Output:
Single Inheritance:
Animal eats
Dog barks

Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays

Hierarchical Inheritance:
Animal eats
Cat meows

Multiple Inheritance:
Child gets property from Father
Child gets property from Mother

Hybrid Inheritance:
Student studies
College student plays sports
    
Result:
Thus, the different types of inheritance in Java are successfully demonstrated using classes and interfaces.

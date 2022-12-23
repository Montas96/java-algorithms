package io.umbrella;

public class Polymorphism {
    public static void main(String args[])
    {
        // object of type A
        A a = new A();

        // object of type B
        B b = new B();

        // object of type C
        C c = new C();

        a.m1();

        A ab = b;
        ab.m1();
        B.m3();
        B.m3("ss");

        A ac = c;
        ac.m1();
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.printMethod(a);
        polymorphism.printMethod(ab);
        polymorphism.printMethod(c);

    }

    private void printMethod(A a){
        a.m1();
    }
}
class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }

    final void m2(){
        System.out.println("method 2");
    }

    static void m3(){
        System.out.println("method 3");
    }
}

class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
    static void m3(){
        System.out.println("B method 3");
    }
    static void m3(String s){
        System.out.println("B method 3: " + s);
    }
}

class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
interface IntA {}
interface IntB{}
interface IntC extends IntA, IntB{}

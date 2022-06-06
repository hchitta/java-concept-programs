package com.company.inheritance;

public class A {

    private int i;
    int j;
    protected int k;
    public int m;

}

class B extends A {
    void methodOfClassB(){
        //System.out.println(i); // compile error, i has private access
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }

    /*public static void main(String[] args) {
        B b = new B();
        b.methodOfClassB();
    }*/
}

class C extends B{
    void methodOfClassC(){
       // System.out.println(i); //i is private
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);

        B b = new B();
        System.out.println(b.j);
        System.out.println(b.k);
        System.out.println(b.m);
    }

    public static void main(String[] args) {
        C c = new C();
        c.methodOfClassC();
    }
}

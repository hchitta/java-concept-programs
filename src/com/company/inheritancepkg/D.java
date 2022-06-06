package com.company.inheritancepkg;

import com.company.inheritance.A;

public class D extends A {

    void methodOfClassD() {
       // System.out.println(i); compile error
       // System.out.println(j); compile error
        System.out.println(k);
        System.out.println(m);

        A a = new A();
        //System.out.println(a.i); error
        // System.out.println(a.j); error
       // System.out.println(a.k); error
        System.out.println(a.m);

    }
}

class E extends D {
    void methodOfClassE() {
       // System.out.println(i); error
        // System.out.println(j); error
        System.out.println(k);
        System.out.println(m);

        D d = new D();
        System.out.println(d.m);
    }
}

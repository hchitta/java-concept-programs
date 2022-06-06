package com.company.Object.Creation;

public class MyClassUsingClone implements Cloneable{

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
            MyClassUsingClone obj = new MyClassUsingClone();
            obj.setS("Object creation using clone method");
            MyClassUsingClone obj2 = (MyClassUsingClone)obj.clone();
            System.out.println(obj2.getS());
    }

    @Override
    public MyClassUsingClone clone() {
        try {
            MyClassUsingClone clone = (MyClassUsingClone) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

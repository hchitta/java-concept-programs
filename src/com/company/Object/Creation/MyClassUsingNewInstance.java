package com.company.Object.Creation;

public class MyClassUsingNewInstance {

    String s = "Object creation using new instance of class";

    public static void main(String[] args) {
        try{
            Class myClass = Class.forName("com.company.Object.Creation.MyClassUsingNewInstance");

            MyClassUsingNewInstance myObj = (MyClassUsingNewInstance)myClass.newInstance();

            System.out.println(myObj.s);

        } catch (ClassNotFoundException cnfe) {
            System.out.println("exception occoured"+cnfe);
        } catch (InstantiationException ie) {
            ie.printStackTrace();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        }

    }
}

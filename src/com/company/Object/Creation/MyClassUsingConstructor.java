package com.company.Object.Creation;

public class MyClassUsingConstructor {

    String str = "Object creation using constructor";

    public static void main(String[] args) {

        try{
            MyClassUsingConstructor myObj = MyClassUsingConstructor.class.getDeclaredConstructor().newInstance();
            System.out.println(myObj.str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

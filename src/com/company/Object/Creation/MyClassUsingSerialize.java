package com.company.Object.Creation;

import java.io.*;

public class MyClassUsingSerialize implements Serializable {
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private String s;



    public static void main(String[] args) {
        MyClassUsingSerialize myClass = new MyClassUsingSerialize();
        myClass.setS("Object using deserialization");

        try{
            FileOutputStream fos = new FileOutputStream("files.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myClass);
            oos.close();
            fos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }


    }
}

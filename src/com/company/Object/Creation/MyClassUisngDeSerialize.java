package com.company.Object.Creation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyClassUisngDeSerialize {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("files.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyClassUsingSerialize mus = (MyClassUsingSerialize)ois.readObject();
            System.out.println(mus.getS());
            ois.close();
            fis.close();
        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }

    }
}

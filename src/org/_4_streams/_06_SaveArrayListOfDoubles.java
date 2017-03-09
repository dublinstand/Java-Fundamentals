package org._4_streams;

//Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream,
// ObjectOutputStream. Set the name of the new file as doubles.list

import java.io.*;
import java.util.ArrayList;

public class _06_SaveArrayListOfDoubles {


    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        list.add(3.11);
        list.add(8.88);
        list.add(88.88);
        list.add(888.88);

        saveObject(list);
        loadObject();
    }

    private static void saveObject(Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/SaveArrayListOfDoubles/doubles.list")))) {
            oos.writeObject(object);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadObject() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/SaveArrayListOfDoubles/doubles.list")
                )
        )) {
            System.out.println("Double numbers: " + ois.readObject());
            ois.close();
        } catch (ClassNotFoundException | IOException cnne) {
            System.out.println(cnne.toString());
        }
    }
}



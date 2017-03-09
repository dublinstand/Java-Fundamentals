package org._4_streams;

//Write a program that saves and loads the information from a custom Object that you have created to a
// file using ObjectInputStream, ObjectOutputStream. Create a class Course that has a String field containing the
// name and an integer field containing the number of students attending the course. Set the name of the new file as course.save.

import java.io.*;

public class _07_SaveCustomObjectInFile {


    public static void main(String[] args) {

        Course course = new Course("Java", 5);

        saveObject(course);
        loadObject();
    }

    private static void saveObject(Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/SaveCustomObjectInFile/course.list")))) {
            oos.writeObject(object);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadObject() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/SaveCustomObjectInFile/course.list")
                )
        )) {
            Object course = ois.readObject();

            System.out.println("This is the course: " + course.toString());
            ois.close();
        } catch (ClassNotFoundException | IOException cnne) {
            System.out.println(cnne.toString());
        }
    }
}




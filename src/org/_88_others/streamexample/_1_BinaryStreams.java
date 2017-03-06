package org._88_others.streamexample;


import java.io.*;
import java.io.IOException;

public class _1_BinaryStreams {
    public static void main(String[] args) {

        try (
                FileInputStream fis =
                        new FileInputStream("resources/binary_streams/java.jpg");
                FileOutputStream fos =
                        new FileOutputStream("resources/binary_streams/java_out.jpg")
        ){
            int i;
            while ((i = fis.read()) != -1) {
                fos.write((char)i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}

package org.w.others.streamexample;


import java.io.*;
import java.io.IOException;

public class _2_CharacterStreams {
    public static void main(String[] args) {

        try (
                FileReader fr =
                        new FileReader("resources/character_streams/input");
                FileWriter fw =
                        new FileWriter("resources/character_streams/output")
        ){
            int i;
            while ((i = fr.read()) != -1) {
                fw.write((char)i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}

package com.bootcoding.fileHandling;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        File file = new File("C://Users//Asus//OneDrive//Documents/JAVA 8 NOTES.txt");

        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);
            String text = null;
            while((text = br.readLine()) != null){
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

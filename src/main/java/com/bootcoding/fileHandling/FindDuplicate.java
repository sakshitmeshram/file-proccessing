package com.bootcoding.fileHandling;

import java.io.*;

public class FindDuplicate {

    public int checkDuplicate(File file , String word){
        int count =0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text = null;
            while((text = bufferedReader.readLine()) != null){

                count =count+chck(text,word);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return count;
    }

    public int chck(String  s , String w){
        int count=0;
        String[] word = s.split(" ");
        for(String  a1:word){
            if(w.toLowerCase().equals(a1.toLowerCase())){
               count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        File file = new File("C:/Users/Asus/Downloads/input.txt");
        FindDuplicate findDuplicate = new FindDuplicate();
        System.out.println(findDuplicate.checkDuplicate(file,"Node.js."));
    }
}

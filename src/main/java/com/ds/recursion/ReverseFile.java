package com.ds.recursion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReverseFile {

    private static void reverseFileText(String pathOfFile){
           try(BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
               String line = "";
               int lineCount= 0;
               while ((line =reader.readLine()) != null){
                   lineCount++;
                   if(lineCount == 3){
                       try(BufferedWriter write = new BufferedWriter(new FileWriter(pathOfFile))) {
                           write.write("I have updated this line as per request");
                       }
                   }
                   System.out.println(line);
               }
               System.out.println("Total lines: "+lineCount);
           } catch (IOException e) {
               e.printStackTrace();
           }
    }

     static void printFileTextRecursively(String pathOfFile){
        Path path = Paths.get(pathOfFile);
        BufferedReader reader= null;
        try {
             reader = Files.newBufferedReader(path);
            String line = "";
            int lineCount= 0;
//            while ((line =reader.readLine()) != null){
//                lineCount++;
//                if(lineCount == 3){
//                    try(BufferedWriter write = new BufferedWriter(new FileWriter(pathOfFile))) {
//                        write.write("I have updated this line as per request");
//                    }
//                }
//                System.out.println(line);
//            }
            reverseLines(reader);
            System.out.println("Total lines: "+lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void reverseLines(BufferedReader reader) throws IOException {
        String input="";
        if((input=reader.readLine()) != null){
            reverseLines(reader);
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        String path = "E:\\infinity\\gitrepo\\DataStructureAndAlgorithms\\src\\main\\resources\\sample.txt";
        printFileTextRecursively(path);
    }
}

package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Ye class file handling operations dikhati hai.
 * @author Yesh
 * @version 1.0
 */
public class create_file {
    public static void main(String[] args) {
        // code to create  a file  ;
        File myfile = new File("lamda.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }
        // code to write in a file
        try {
            FileWriter fileWriter = new FileWriter("lamda.txt");
            fileWriter.write("okkey ");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(" Nothjing has been written in the file.....code not excuted properly");
            throw new RuntimeException(e);
        }

// code for writing a file
                File file = new File("text.txt") ;
            try {
                Scanner sc = new Scanner(file) ;
                while (sc.hasNextLine()) {
                    String op = sc.nextLine() ;
                    System.out.println(op);

                }
                sc.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

    }
}

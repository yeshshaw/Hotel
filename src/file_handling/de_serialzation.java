package file_handling;

import java.io.*;

public class de_serialzation {
    public static void main(String[] args) {
        String fileNmae = "lamda.txt" ;
        try {
            FileInputStream fis = new FileInputStream(fileNmae) ; // file me maine jo bhi likha h usse fetch out karne ka kaam karta h
            try {
                ObjectInputStream ois = new ObjectInputStream(fis) ; // file jo bhi object ka byte code me likha hua h usse access  karna
                try {
                    Student obj = (Student)ois.readObject() ;
                    System.out.println(obj.name);
                    System.out.println(obj.roll);
                    ois.close();
                    fis.close();
                } catch (ClassNotFoundException e) {
                    System.out.println("object of the tudent class not found...");
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                System.out.println("Byte code is not converted....");
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found...");
            throw new RuntimeException(e);
        }

    }
}

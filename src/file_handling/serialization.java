package file_handling;

import java.io.*;

public class serialization  {
 // serialization is an mechanism to converting the State of an object into byte Stream
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yesh";
        s1.roll = 21;
        String fileNmae = "lamda.txt";

        try {
            FileOutputStream fos = new FileOutputStream(fileNmae);// yhh file ko karne ke liye kaam aata h

            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(s1);
                oos.close();
                fos.close();
            } catch (IOException e) {

                System.out.println("Can't Store the byte Stream of the Object oos ");
                throw new RuntimeException(e);

            }

        } catch (FileNotFoundException e) {
            System.out.println("We created the file where we can do our operations like read write is not working");

        }
    }
}

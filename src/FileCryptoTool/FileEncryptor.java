package FileCryptoTool;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEncryptor {

    public void encryptFile(String inputFile , String outputFile , int key ) throws IOException {
            try (FileInputStream fis = new FileInputStream(inputFile);
                    FileOutputStream fos = new FileOutputStream(outputFile) ) {
                    int data ;
                    while ( (data = fis.read()) != -1 ){
                         fos.write(data^key); // xor logic

                    }
            }

    }
 public void decryptFile(String inputFile , String outputFile , int key ) throws IOException {
        //xor again for reverse
        encryptFile(inputFile , outputFile , key);
 }

}

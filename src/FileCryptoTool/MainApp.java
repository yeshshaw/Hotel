package FileCryptoTool;

import java.io.File;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("📂 Current working directory: " + new File(".").getAbsolutePath());
        Scanner sc = new Scanner(System.in) ;

        FileEncryptor encryptor = new FileEncryptor() ;

        System.out.println("========= File Encryption && Decryption ==========");
        System.out.println("1. Encrypt a file ");
        System.out.println("2. Decrypt a file ");
        System.out.println( "Choose a option ( 1 or 2 )");
        int choice = sc.nextInt() ;
        sc.nextLine() ;
        System.out.println("Enter input file path : ");
        String inputFile = sc.nextLine() ;
        System.out.println("Enter the output file path : ");
        String outputFile = sc.nextLine() ;
        System.out.println(" Enter numeric key (0 - 255)");
        int key = sc.nextInt() ;
         try {
              if ( choice == 1 ) {
                  encryptor.encryptFile(inputFile , outputFile , key);
                  System.out.println("✅ File encrypted successfully.");
              }
              else if (choice == 2 ){
                  encryptor.decryptFile(inputFile , outputFile , key);
                  System.out.println("✅ File decrypted successfully.");
              } else {

                  System.out.println("❌ Invalid choice.");
              }
         } catch (Exception e) {
             System.out.println("❌ Error: " + e.getMessage());
         }
         }


    }

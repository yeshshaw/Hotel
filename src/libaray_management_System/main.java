package libaray_management_System;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        library lib = new library() ;
        Scanner sc = new Scanner(System.in) ;
        while ( true ){
            System.out.println("\n📚 Library Management System");
            System.out.println("1️⃣ Add Book");
            System.out.println("2️⃣ View Books");
            System.out.println("3️⃣ Issue Book");
            System.out.println("4️⃣ Return Book");
            System.out.println("5️⃣ Exit");
            System.out.print("🔹 Choose an option: ");
            int choice = sc.nextInt() ;
            switch (choice) {
                case 1 : lib.addbook(); break;
                case 2 : lib.viewbook(); break;
                case 3 : lib.issuebook(); break ;
                case 4 : lib.returnbook(); break ;
                case 5 :
                    System.out.println("\uD83D\uDE80 Exiting...");
                    return;
                default:
                    System.out.println("⚠️ Invalid Choice! Try again.");
            }
        }

    }
}

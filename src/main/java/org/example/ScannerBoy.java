package org.example;

import java.util.Scanner;

public class ScannerBoy {
    public static String getString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String out = scanner.nextLine();
        scanner.close();
        return out;

    }

    public static Integer getInteger(String message){
        Integer out = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Boolean end = false;
        do{
            if (scanner.hasNextInt()){
                out = scanner.nextInt();
                end = true;
            } else {
                System.out.println(scanner.next() + " is not a number.");
            }
        } while(!end);
        scanner.close();
        return out;
    }
}


package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name Generator ");


        System.out.print("First Name: ");
        String first = scanner.next();
        System.out.print("Middle Name: ");
        String middle = scanner.next();
        System.out.print("Last Name: ");
        String last = scanner.next();
        System.out.print("Suffix:");
        String suffix = scanner.next();

    }
}

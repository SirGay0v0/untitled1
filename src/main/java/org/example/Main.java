package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1) Sign in by email");
        System.out.println("2) Sign in by phone number");
        System.out.print("Choose your option: ");

        int choose = sc.nextInt();

        switch (choose) {
            case 1: {
                System.out.println();
                System.out.print("Write your email: ");
                sc.nextLine();
                String email = sc.nextLine();
                ActionTrueEmail.examination(email);
            }
            case 2: {
                System.out.println();
                System.out.print("Write your phone number: ");
                sc.nextLine();
                String number = sc.nextLine();
                ActionTrueNumber.examination(number);
            }
        }
    }
}

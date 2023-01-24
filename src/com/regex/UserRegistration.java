package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static void checkValidFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.nextLine();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName));
    }

    private static void checkValidLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Last name:");
        String lastName = sc.nextLine();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex");
        checkValidFirstName();
        checkValidLastName();
    }
}

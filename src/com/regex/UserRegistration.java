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

    private static void checkValidEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email  ");
        String emailID = sc.nextLine();
        System.out.println(Pattern.matches("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$", emailID));
    }

    private static void checkValidMobileNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number ");
        String mobileNo = sc.nextLine();
        System.out.println(Pattern.matches("^([+][0-9]{2}[ ][1-9]{1}[0-9]{9})$", mobileNo));
    }

    public static void checkValidPasswordEightDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password ");
        String password = sc.nextLine();
        System.out.println(Pattern.matches("^([A-Za-z0-9]{8,})$", password));
    }

    public static void checkPasswordAtLeastOneCharShouldCapital() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password ");
        String password = sc.nextLine();
        System.out.println(Pattern.matches("^([A-Za-z0-9]{8,})$", password));
    }

    public static void checkAtLeastPasswordShouldHaveOneDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password ");
        String password = sc.nextLine();
        System.out.println(Pattern.matches("^((?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,})$", password));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex");
        checkValidFirstName();
        checkValidLastName();
        checkValidEmailId();
        checkValidMobileNo();
        checkValidPasswordEightDigit();
        checkPasswordAtLeastOneCharShouldCapital();
        checkAtLeastPasswordShouldHaveOneDigit();
    }
}

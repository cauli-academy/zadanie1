package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        version1();
//        version2();
//        version3();
    }

    private static void version3() {
        System.out.println("Witaj w grze");
        int userValueAsInt;
        do {
            String userValue = getUserValue();
            userValueAsInt = parseUserValue(userValue);
            if (userValueAsInt > 0 && userValueAsInt <= 31) {
                printMonths(userValueAsInt);
            } else if (userValueAsInt != 0) {
                System.out.println(userValue + " nie jest poprawną wartością");
            }
        } while (userValueAsInt <= 31 && userValueAsInt > 0);
    }

    private static void version2() {
        System.out.println("Witaj w grze");
        startGame();
    }

    private static void startGame() {
        String userValue = getUserValue();
        int userValueAsInt = parseUserValue(userValue);
        if (userValueAsInt > 0 && userValueAsInt <= 31) {
            printMonths(userValueAsInt);
            startGame();
        } else if (userValueAsInt != 0) {
            System.out.println(userValue + " nie jest poprawną wartością");
        }
    }

    private static void version1() {
        System.out.println("Witaj w grze");
        String userValue = getUserValue();
        int userValueAsInt = parseUserValue(userValue);
        if (userValueAsInt > 0 && userValueAsInt <= 31) {
            printMonths(userValueAsInt);
        } else if (userValueAsInt != 0) {
            System.out.println(userValue + " nie jest poprawną wartością");
        }
    }

    //

    private static String getUserValue() {
        System.out.println("Podaj dzień miesiąca");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int parseUserValue(String userValue) {
        int userValueAsInt = 0;
        try {
            userValueAsInt = Integer.parseInt(userValue);
            if (userValueAsInt == 0) {
                System.out.println(userValue + " nie jest poprawną wartością");
            }
        } catch (Exception e) {
            System.out.println(userValue + " nie jest poprawną wartością");
        }
        return userValueAsInt;
    }

    private static void printMonths(int userValueAsInt) {
        if (userValueAsInt > 0 && userValueAsInt <= 29) {
            System.out.println("Luty");
        }
        if (userValueAsInt > 0 && userValueAsInt <= 30) {
            System.out.println("Kwiecień, Czerwiec,  Wrzesień, Listopad");
        }
        if (userValueAsInt > 0 && userValueAsInt <= 31) {
            System.out.println("Styczen, Marzec, Maj, Lipiec, Sierpień, Październik, Grudzień");
        }
    }
}
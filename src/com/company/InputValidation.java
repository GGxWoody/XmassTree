package com.company;

import java.util.Scanner;

public class InputValidation {
    

    public int getPositiveInt() {
        Scanner inputInt = new Scanner(System.in);
        int numberToReturn = 0;
        boolean isNumberCorrect;
        System.out.println("Podaj wysokosc drzewa (liczba dodatnia):");
        do {
            if (inputInt.hasNextInt()) {
                numberToReturn = inputInt.nextInt();
                if (numberToReturn < 0) {
                    System.out.println("Zla liczba podaj ponownie");
                    isNumberCorrect = false;
                    continue;
                }
                isNumberCorrect = true;
            } else {
                System.err.println("Podaj liczbe!");
                isNumberCorrect = false;
                inputInt.next();
            }


        } while (!isNumberCorrect);
        return numberToReturn;
    }

    public String isStringCorrect() {
        Scanner inputString = new Scanner(System.in);
        String stringToReturn = inputString.nextLine().toLowerCase();
        boolean isStringCorrect = false;
        do switch (stringToReturn) {
            case "right":
                isStringCorrect = true;
                break;
            case "left":
                isStringCorrect = true;
                break;
            case "up":
                isStringCorrect = true;
                break;
            case "down":
                isStringCorrect = true;
                break;
            default:
                System.out.println("Podales zly kierunek podaj ponownie: ");
                stringToReturn = inputString.nextLine().toLowerCase();
                break;
        } while (!isStringCorrect);
        return stringToReturn;
    }

    public char isCharCorrect() {
        Scanner inputChar = new Scanner(System.in);
        char charToReturn = '\n';
        boolean isCharCorrect = false;
        do {
            String testString = inputChar.nextLine();
            if (testString.length() == 1) {
                charToReturn = testString.charAt(0);
                isCharCorrect = true;
            } else {
                System.out.println("Podaj pojedyncza litere");
            }
        } while (!isCharCorrect);


        return charToReturn;
    }
}

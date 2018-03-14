package com.company;

import java.util.Scanner;

public class InputValidation {
    private Scanner input = new Scanner(System.in);

    public int getPositiveInt() {
        int numberToReturn = 0;
        boolean isNumberCorrect;
        System.out.println("Podaj wysokosc drzewa (liczba dodatnia):");
        do {
            if (input.hasNextInt()) {
                numberToReturn = input.nextInt();
                if (numberToReturn < 0) {
                    System.out.println("Zla liczba podaj ponownie");
                    isNumberCorrect = false;
                    continue;
                }
                isNumberCorrect = true;
            } else {
                System.err.println("Podaj liczbe!");
                isNumberCorrect = false;
                input.next();
            }


        } while (!isNumberCorrect);
        return numberToReturn;
    }

    public String isStringCorrect() {
        input.next();
        String stringToReturn = input.nextLine().toLowerCase();
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
                stringToReturn = input.nextLine().toLowerCase();
                break;
        } while (!isStringCorrect);
        return stringToReturn;
    }

    public char isCharCorrect() {
        input.next();
        char charToReturn = '\n';
        boolean isCharCorrect = false;
        do {
            String testString = input.nextLine();
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

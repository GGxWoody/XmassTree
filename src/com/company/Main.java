package com.company;


public class Main {

    public static void main(String[] args) {
        InputValidation validator = new InputValidation();
        System.out.println("Podaj rozmiar drzewa");
        int treeSize = validator.getPositiveInt();
        System.out.println("Podaj kierunek drzewa");
        String treeDirection = validator.isStringCorrect();
        System.out.println("Podaj z czego ma sie skladac drzewo: ");
        char treeBuildingChar = validator.isCharCorrect();
        XmasTreeDraw treeToDraw = new XmasTreeDraw(treeSize, treeDirection, treeBuildingChar);
        DecisionMaker dm = new DecisionMaker(treeToDraw);
        dm.makeDecision();
    }
}

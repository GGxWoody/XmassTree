package com.company;

public class XmasTreeDraw {
    private int sizeOfTree;
    private String directionOfTree;
    private char treeBuildingLetter;

    public XmasTreeDraw(int sizeOfTree, String directionOfTree, char treeBuildingLetter) {
        this.sizeOfTree = sizeOfTree;
        this.directionOfTree = directionOfTree;
        this.treeBuildingLetter = treeBuildingLetter;
    }

    public void drawTreeUp() {
        for (int i = 0; i < this.sizeOfTree; i++) {
            writeTreeLineUp(i, this.sizeOfTree, this.treeBuildingLetter);
        }
        System.out.println();
    }

    public void drawTreeDown() {
        for (int i = 0; i < this.sizeOfTree; i++) {
            writeTreeLineDown(i, this.sizeOfTree, this.treeBuildingLetter);
        }
    }

    public void drawTreeRight() {
        for (int i = 0; i <= (this.sizeOfTree * 2 - 1); i++) {
            writeTreeLineRight(i, this.sizeOfTree, this.treeBuildingLetter);
        }
    }

    public void drawTreeLeft() {
        for (int i = 0; i <= (this.sizeOfTree * 2 - 1); i++) {
            writeTreeLineLeft(i, this.sizeOfTree, this.treeBuildingLetter);
        }
    }

    public static void writeTreeLineUp(int lineNumber, int sizeOfTree, char treeBuildingLetter) {

        for (int i = 1; i < sizeOfTree - lineNumber; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < (lineNumber * 2) + 1; i++) {
            System.out.print(treeBuildingLetter);
        }
        System.out.println();
    }

    public static void writeTreeLineDown(int lineNumber, int sizeOfTree, char treeBuildingLetter) {
        for (int i = lineNumber; i > 0; i--) {
            System.out.print(" ");
        }
        for (int i = 0; i < ((sizeOfTree - lineNumber) * 2) - 1; i++) {
            System.out.print(treeBuildingLetter);
        }
        System.out.println();
    }

    public static void writeTreeLineRight(int lineNumber, int sizeOfTree, char treeBuildingLetter) {
        if (lineNumber <= sizeOfTree) {
            for (int i = 0; i < lineNumber; i++) {
                System.out.print(treeBuildingLetter);
            }
        } else {
            for (int i = sizeOfTree; i > lineNumber - sizeOfTree; i--) {
                System.out.print(treeBuildingLetter);
            }
        }
        System.out.println();
    }

    public static void writeTreeLineLeft(int lineNumber, int sizeOfTree, char treeBuildingLetter) {
        if (lineNumber <= sizeOfTree) {
            for (int i = 0; i < sizeOfTree - lineNumber; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < lineNumber; i++) {
                System.out.print(treeBuildingLetter);
            }
        } else {
            for (int i = 0; i < lineNumber - sizeOfTree; i++) {
                System.out.print(" ");
            }
            for (int i = sizeOfTree; i > lineNumber - sizeOfTree; i--) {
                System.out.print(treeBuildingLetter);
            }
        }
        System.out.println();
    }

    public String getDirectionOfTree() {
        return directionOfTree;
    }
}

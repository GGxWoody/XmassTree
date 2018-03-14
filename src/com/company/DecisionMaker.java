package com.company;

public class DecisionMaker {
    private XmasTreeDraw treeToDecide;

    public DecisionMaker(XmasTreeDraw treeToDecide) {
        this.treeToDecide = treeToDecide;
    }

    public void makeDecision()
    {
        String decision = this.treeToDecide.getDirectionOfTree();
        switch(decision)
        {
            case "up":
                treeToDecide.drawTreeUp();
                break;
            case "down":
                treeToDecide.drawTreeDown();
                break;
            case "left":
                treeToDecide.drawTreeLeft();
                break;
            case "right":
                treeToDecide.drawTreeRight();
                break;
        }
    }
}

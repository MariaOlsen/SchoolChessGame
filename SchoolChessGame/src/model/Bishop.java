/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author maria
 */
public class Bishop extends ChessPiece {

    public Bishop(String name, boolean color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }

    public boolean canMoveTo(int x, int y) {

        if ((super.canMoveTo(x, y) == true) && (bishopMove(x, y) == true)) {
            return true;
        }

        return false;
    }

    private boolean bishopMove(int x, int y) {
        boolean test = false;

        System.out.println("Start: " + super.getxPosition() + "," + super.getyPosition());
        
        //In chess, the horizontal tiles are called Files (x-axis)
        //the vertical tiles are called Ranks (y-axis)
        for (int file = 1; file < 9; file++) {
            for (int rank = 1; rank < 9; rank++) {
                if ((Math.abs(file - super.getxPosition()) == Math.abs(rank - super.getyPosition()))) {
                    System.out.println("True");
                    System.out.println("Possible: (" + file + "," + rank + ")");
                    test = true;
                }
            }
        }


        
        return test;
    }

}

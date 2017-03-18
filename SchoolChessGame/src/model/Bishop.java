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

    public Bishop(String name, String color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }

    
    /*
    Tests whether a piece can move to a specific field, depending on common rules and unique piece rules
    */
    public boolean canMoveTo(int x, int y) {

        if ((super.canMoveTo(x, y) == true) && (bishopMove(x, y) == true)) {
            return true;
        }

        return false;
    }

      /*
    Unique movement system for bishops. Supportive method for canMoveTo()
    */
    private boolean bishopMove(int x, int y) {
        boolean test = false;

        //If the difference between the Xs coordinates and the Y coordinates are equal to each other
        //The bishop can move - diagonal movements.
        if ((Math.abs(x - super.getxPosition()) == Math.abs(y - super.getyPosition()))) {
            test = true;
        }

        return test;
    }

}

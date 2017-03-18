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
public class Knight extends ChessPiece {

    public Knight(String name, String color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }

    /*
    Tests whether a piece can move to a specific field, depending on common rules and unique piece rules
    */
    public boolean canMoveTo(int x, int y) {

        //Returns a true value if the current field (x,y) can be moved to by this piece
        if ((super.canMoveTo(x, y) == true) && (knightMove(x, y) == true)) {
            return true;
        }

        return false;
    }

    /*
    Unique movement system for knights. Supportive method for canMoveTo()
    */
    private boolean knightMove(int x, int y) {
        boolean test = false;

       //Eases use of the integer differences
        int xDif, yDif;
        xDif = Math.abs(x - super.getxPosition());
        yDif = Math.abs(y - super.getyPosition());

        //Showing possible moves
        if ((xDif == 2) && (yDif == 1) || (yDif == 2) && (xDif == 1)) {
            test = true;
        }

        return test;
    }

}

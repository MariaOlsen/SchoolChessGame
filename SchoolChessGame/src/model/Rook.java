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
public class Rook extends ChessPiece {

    public Rook(String name, String color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }

    
    /*
    Tests whether a piece can move to a specific field, depending on common rules and unique piece rules
    */
    public boolean canMoveTo(int x, int y) {
        if ((super.canMoveTo(x, y) == true) && (rookMove(x, y) == true)) {
            return true;
        } else {
        return false; 
        }
      
    }

    
    /*
    Unique movement system for rooks. Supportive method for canMoveTo()
    */
    private boolean rookMove(int x, int y) {
        boolean test = false;
        
        //If either x or y remains the same while the other variable changes, it's a viable move
        if (((x != super.getxPosition()) && (y == super.getyPosition()))
                || ((x == super.getxPosition()) && (y != super.getyPosition()))) {
            test = true;
        } else {
            test = false;
        }
        
        return test;
    }

}

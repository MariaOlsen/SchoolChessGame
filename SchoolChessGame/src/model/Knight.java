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
    
    public Knight(String name, boolean color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }
    
    
    
    public boolean canMoveTo(int x, int y) {
      
       //Returns a true value if the current field (x,y) can be moved to by this piece
        if ((super.canMoveTo(x, y) == true) && (knightMove(x, y) == true)) {
            return true;
        }

        return false;
    }

    private boolean knightMove(int x, int y) {
        boolean test = false;

       


        return test;
    }

    
    
}

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
        
        
        //Two int values for the biggest and smallest - x vs y
        //Two int values, retrieving the xPosition and yPosition for comparison
        int biggest, cBiggest, smallest, cSmallest;
        
        //Comparing x vs y
        if(Math.abs(x) > Math.abs(y)){
            biggest = x;
            cBiggest = super.getxPosition();
            smallest = y;
            cSmallest = super.getyPosition();
        } else  {
            biggest = y;
            cBiggest = super.getyPosition();
            smallest = x;
            cSmallest = super.getxPosition();
        }
       
        //Showing possible moves
        if ((biggest == cBiggest + 2) && (smallest == cSmallest + 1)){
            test = true;
        }


        return test;
    }

    
    
}

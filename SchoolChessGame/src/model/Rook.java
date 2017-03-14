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
public class Rook  extends ChessPiece {
    
    public Rook(String name, boolean color, int xPosition, int yPosition) {
        super(name, color, xPosition, yPosition);
    }
    
    public boolean canMoveTo(int x, int y){
        
        return super.canMoveTo(x, y);
    }
    
}

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

    public boolean canMoveTo(int x, int y) {

        if ((super.canMoveTo(x, y) == true) && (bishopMove(x, y) == true)) {
            return true;
        }

        return false;
    }

    private boolean bishopMove(int x, int y) {
        boolean test = false;

        if ((Math.abs(x - super.getxPosition()) == Math.abs(y - super.getyPosition()))) {
            test = true;
        }

        return test;
    }

}

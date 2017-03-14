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

    public boolean canMoveTo(int x, int y) {
        System.out.println("ROOK::CANMOVETO()");
        if ((super.canMoveTo(x, y) == true) && (rookMove(x, y) == true)) {
            return true;
        }
        System.out.println("Super:Can move to " + super.canMoveTo(x, y));
        return false;
    }

    private boolean rookMove(int x, int y) {
        boolean test = false;
        System.out.print("RookMove::");
        if (((x != super.getxPosition()) && (y == super.getyPosition()))
                || ((x == super.getxPosition()) && (y != super.getyPosition()))) {
            test = true;
        } else {
            test = false;

        }
        System.out.println(test);
        System.out.println("ROOK: (" + x + "," + y
                + ")\nnPos: (" + super.getxPosition()
                + "," + super.getyPosition()+")");
        return test;
    }

}

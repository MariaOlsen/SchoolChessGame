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
      //  System.out.println("ROOK::CAN)");
        if ((super.canMoveTo(x, y) == true) && (rookMove(x, y) == true)) {
            return true;
        } else {
//            System.out.println("Super::MoveTo:: " + super.canMoveTo(x, y));
//        System.out.println("RookMove:: " + rookMove(x,y));
        return false; 
        }
      
    }

    private boolean rookMove(int x, int y) {
        boolean test = false;
        if (((x != super.getxPosition()) && (y == super.getyPosition()))
                || ((x == super.getxPosition()) && (y != super.getyPosition()))) {
//              System.out.println("Rook can move from: (" + super.getxPosition() + "," + super.getyPosition()
//                      + ") - (" + x + "," + y + ")");
            test = true;
        } else {
            test = false;
//             System.out.println("Rook cannot move from: (" + super.getxPosition() + "," + super.getyPosition()
//                     + ") - (" + x + "," + y + ")");

        }
        //System.out.println(test);
        //System.out.println("ROOK: (" + x + "," + y
//                + ")\nnPos: (" + super.getxPosition()
//                + "," + super.getyPosition()+")");
        return test;
    }

}

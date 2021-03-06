/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;

/**
 *
 * @author maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

        ChessPiece[] chessPieces;

        chessPieces = new ChessPiece[3];

        chessPieces[0] = new Rook("Rook", "Black", 1, 1);
        chessPieces[1] = new Bishop("Bishop", "White", 2, 6);
        chessPieces[2] = new Knight("Knight", "Grey", 3, 3);

        for (ChessPiece c : chessPieces) {
            System.out.println(c.show());
            System.out.println("");
            
        }

        
        chessPieces[0].move(3, 1);
        
        
        chessPieces[1].move(7, 0);
        
        chessPieces[2].move(1, 2);

        for (ChessPiece c : chessPieces) {
            System.out.println("");
            System.out.println("\n" + c.show());
        }
    }

}

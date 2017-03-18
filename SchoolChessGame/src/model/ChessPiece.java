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
public abstract class ChessPiece {

    private String name;
    //White = 0, Black = 1
    private String color;
    private int xPosition;
    private int yPosition;

    public ChessPiece(String name, String color, int xPosition, int yPosition) {
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /*
       Tests if a chess piece can move from current position (xPosition, yPosition) to a new position (x,y)
    */
    public boolean canMoveTo(int x, int y) {

        if ((x < 8) && (y < 8) && ((x != xPosition) || (y != yPosition))) {
            return true;
        } else {
            return false;
        }

    }

    /*
    Converts the position (x,y) into the equivalent file and rank on the chessboard.
    */
    public String positionToField(int x, int y) {
        String position = "";

        switch (x) {
            case 0:
                position = "a";
                break;
            case 1:
                position = "b";
                break;
            case 2:
                position = "c";
                break;
            case 3:
                position = "d";
                break;
            case 4:
                position = "e";
                break;
            case 5:
                position = "f";
                break;
            case 6:
                position = "g";
                break;
            case 7:
                position = "h";
                break;
        }

        position = position + Integer.toString(y + 1);

        return position;
    }

    /*
    Runs through each tile in the chessboard and puts each tile that the chess piece can be moved to,
    into an array of Strings, through the "canMoveTo" and "positionToField" methods.
    
    */
    public String[] possibleMoves() {
        //At any one time, the maximum number of steps a piece is allowed to take will be 21 or less
        String[] moves = new String[22];

        //Counter for the number of possible moves
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (canMoveTo(i, j) == true) {
                    moves[count] = positionToField(i, j);
                    count = count + 1;
                }
            }
        }

        //Remove nulls from string array
        String[] nMoves = new String[count];
        int nMovesCount = 0;
        //Runs through the string array. If a not-null is found, place that string value into the second array
        for (int i = 0; i < moves.length; i++) {
            if (moves[i] != null) {
                nMoves[nMovesCount] = moves[i];
                nMovesCount = nMovesCount + 1;
            }
        }
        return nMoves;
    }

    /*
    Prints all possible moves for any given piece.
    */
    public String show() {
        String moves = "";
        
        for (String s : possibleMoves()) {
            moves = "-" + s + moves;
        }
        
        return this.color + " " + this.name
                + " Pos: " + positionToField(xPosition,yPosition) + "\nKan rykke til: " + moves;
    }

    /*
    Changes the chess-piece's x-and-y coordinates to a given position if possible.
    */
    public void move(int x, int y) {
        System.out.println("");
        if (canMoveTo(x, y) == true) {
            System.out.println(this.color + " " + this.name
                    + " " + positionToField(xPosition, yPosition) + " -> " + positionToField(x, y));

            xPosition = x;
            yPosition = y;
        } else {
            System.out.println("Ugyldigt træk! " + this.color + " " + this.name
                    + " " + positionToField(xPosition, yPosition) + " -> " + positionToField(x, y));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

}

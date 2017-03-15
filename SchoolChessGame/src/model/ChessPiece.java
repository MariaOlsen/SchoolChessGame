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

    public boolean canMoveTo(int x, int y) {
        
        if ((x < 8) && (y < 8) && ((x != xPosition)|| (y != yPosition))) {
          //  System.out.println("ChessPiece::CanMoveTo = true");
            return true;
        } else {
          //  System.out.println("ChessPiece::CanMoveTo = False");
        return false;
        }

    }

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

    public String[] possibleMoves() {
        //At any one time, the maximum number of steps a piece is allowed to take will be 21 or less
        String[] moves = new String[21];

        for (String s : moves) {
            s = "";
        }
        
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (canMoveTo(i, j)) {

                    moves[count] = positionToField(xPosition, yPosition);
                    count = count + 1;
                }
            }
        }

        return moves;
    }

    public String show() {
        String moves = "";

        for (String s : possibleMoves()) {
            moves = s + " - " + moves;
        }

        return "superSHOW::" + this.color + ": " + this.name
                + "::Pos (" + xPosition + "," + yPosition + ")\nKan rykke til: " + moves;
    }

    public void move(int x, int y) {
        if (canMoveTo(x, y) == true) {
           // System.out.println(this.color + " " + this.name
               //     + positionToField(xPosition, yPosition) + " -> " + positionToField(x, y));

            xPosition = x;
            yPosition = y;
        } else {
          //  System.out.println("Ugyldigt træk!");
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

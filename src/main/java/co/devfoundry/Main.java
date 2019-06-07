package co.devfoundry;

import co.devfoundry.Chess.*;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackPawn = new BlackPiece("Czarny Pionek",7, 'a');
        ChessPiece whitePawn = new WhitePiece("Biały Pionek",2,'a');
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");

        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());

        System.out.println(blackQueen.getColor());
        System.out.println(whiteQueen.getColor());
    }

}

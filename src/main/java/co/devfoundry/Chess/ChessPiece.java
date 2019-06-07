package co.devfoundry.Chess;

public abstract class ChessPiece {

    private String name;
    private int numberPosition;
    private char letterPosition;
    private Color color;

    public ChessPiece(String name, int numberPosition, char letterPosition, String namedColor) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        if (namedColor.compareToIgnoreCase("black") == 0) {
            this.color = ColorRepository.getBlack();
        } else {
            this.color = ColorRepository.getWhite();
        }
    }

    protected ChessPiece(){};

    public String getName() {
        return name;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public char getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}

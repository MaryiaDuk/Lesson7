public class Furniture {
    private String name;
    private int square;

    public Furniture(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }
}
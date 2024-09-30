package Sept30;

public class Coord {
    int row;
    double col;

    public Coord(int row, double col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "row: " + row + " col: " + col ;
    }
}

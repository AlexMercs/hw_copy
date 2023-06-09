package model;

public class Position {
    private final int row;
    private final int column;

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }
    public int getRow(){
        return row;
    }
    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "(" + row+1 + ',' + column+1 + ')';
    }
}
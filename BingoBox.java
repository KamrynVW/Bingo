public class BingoBox {
    BingoSquare[][] numbers;
    int boxID;

    public void setBoxID(int num) {
        boxID = num;
    }

    public int getBoxID() {
        return boxID;
    }

    public BingoSquare getSquare(int x, int y) {
        return numbers[x][y];
    }

    public void setNumbers(BingoSquare[][] box) {
        numbers = box;
    }

    public void fillBox() {
        //Fill bingo box with BingoSquare values
    }
}
public class BingoSquare {
    int value;
    boolean pulled;

    public boolean isPulled() {
        return pulled;
    }

    public void pull() {
        pulled = true;
    }

    public int getSquareValue() {
        return value;
    }

    public void setSquareValue(int num) {
        value = num;
    }
}
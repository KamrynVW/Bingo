public class BingoCard {
    BingoBox boxOne;
    BingoBox boxTwo;
    int cardID;

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int value) {
        cardID = value;
    }

    public void setBoxOne(BingoBox box) {
        boxOne = box;
    }

    public void setBoxTwo(BingoBox box) {
        boxTwo = box;
    }

    public BingoBox getBoxOne() {
        return boxOne;
    }

    public BingoBox getBoxTwo() {
        return boxTwo;
    }
}
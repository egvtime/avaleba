public class Sandwich extends Product{
    int length;
    public Sandwich(int date, int price, int length) {
        super(date, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

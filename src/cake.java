public class cake extends Product{
    int mass;
    public cake(int date, int price, int mass) {
        super(date, price);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}

public class Milk extends Product {
    int Area;

    public Milk(int Date, int Price,int area) {
        super(Date, Price);
        Area = area;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }
}

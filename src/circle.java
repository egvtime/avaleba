public class circle extends Shape{
    int Radius;

    public circle( int radius) {
        super(0, 0);
        Radius = radius;
    }

    public double getCircumfrance(){
        double Circumfrance;
        Circumfrance = 2*3.14*Radius;
        return Circumfrance;
    }

    @Override
    public int getArea() {
        super.Area = (int) ((Radius^2) * 3.14);
        return super.Area;
    }
}

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        super(0, 0);
        this.length = length;
        this.width = width;
        SetArea();
        SetPerimiter();
    }

    public void SetArea(){
        super.Area = (int) (length*width);
    }

    public void SetPerimiter(){
        super.Perimiter = (int) (2*(length+width));
    }

    @Override
    public int getArea() {
        return super.getArea();
    }


    @Override
    public int getPerimiter() {
        return super.getPerimiter();
    }

    public double GetDiagonal(){
        double diagonal;
        diagonal = Math.sqrt((length*length) + (width*width));
        return diagonal;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

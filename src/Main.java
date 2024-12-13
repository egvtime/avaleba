public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        Rectangle rectangle = new Rectangle(2, 2);

        System.out.println(rectangle.getPerimiter());
        System.out.println(rectangle.getArea());

        circle circle = new circle(1);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumfrance());

        Store store = new Store();

        Milk milk = new Milk(1, 2, 3);
        cake cake = new cake(1, 2, 3);

        Product[] list = {milk, cake};

        store.setProduct(list);

        store.getProduct();

    }
}
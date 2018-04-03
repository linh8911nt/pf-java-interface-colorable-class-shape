package rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("white", false, 2.4, 5);
        System.out.println(rectangle);
    }
}

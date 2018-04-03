package square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square("black", true, 3.5);
        System.out.println(square);
    }
}

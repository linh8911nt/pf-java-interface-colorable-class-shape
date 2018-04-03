import rectangle.Rectangle;
import shape.Shape;
import square.Square;

public class InterfaceColorableClassShape {
    public static void main(String[] args) {
        Square square = new Square();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("black", false, 2.4, 5);
        shapes[1] = new Square("green", true, 3);
        shapes[2] = new Square("yellow", false, 5);

        for (int i = 0; i < shapes.length; i++){
            System.out.print(shapes[i]);
            if (shapes[i].isFilled()) {
                square.howToColor();
            } else {
                System.out.println();
            }
        }
    }
}

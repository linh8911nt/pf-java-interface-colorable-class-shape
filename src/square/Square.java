package square;

import colorable.Colorable;
import rectangle.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println(" color all four sides.");
    }

    @Override
    public String toString() {
        return "Square with side "
                + getSide()
                + ", area is "
                + getArea()
                + " which is a subclass of "
                + super.toString();
    }
}

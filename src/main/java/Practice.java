import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


abstract class Shape{
    private double width;
    private double height;

    public Shape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public final double getWidth(){return width;}
    public final double getHeight(){return height;}
    abstract double getArea();
}
class Rectangle extends Shape{
    public Rectangle(double width, double height){
        super(width, height);
    }
    @Override
    final double getArea(){
        return this.getHeight() * this.getWidth();
    }
}
class Square extends Shape{
    public Square(double side){
        super(side,side);
    }
    @Override
    final double getArea(){
        return this.getHeight() * this.getWidth();
    }
}
public class Practice {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(10,20);
        Shape s2 = new Square(10);

        System.out.println("s1 width: "+ s1.getWidth() );
        System.out.println("s1 height: "+s1.getHeight());
        System.out.println("s1 area: "+s1.getArea());
        System.out.println();
        System.out.println("s2 width: "+s2.getWidth());
        System.out.println("s2 height: "+s2.getHeight() );
        System.out.println("s2 Area: "+s2.getArea());

    }


}


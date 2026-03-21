package Test;
abstract class Shape{
    abstract double calculateArea();

}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
   public double calculateArea() {
        return Math.PI *radius*radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;

    }
    @Override
    public double calculateArea() {
        return width*length;
    }
}
class Triangle extends Shape{
    private double a;
    private double b;
   Triangle(double a,double b){
       this.a=a;
       this.b=b;

   }
   @Override
    public double calculateArea() {
       return  0.5* a*b;
   }
}
public class Quest3 {
    public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape triangle = new Triangle(5,5);
    Shape rectangle = new Rectangle(5,5);
    System.out.println("Area of Circle is:"+circle.calculateArea());
    System.out.println("Area of Triangle is:"+triangle.calculateArea());
    System.out.println("Area of Rectangle is:"+rectangle.calculateArea());
    }
}

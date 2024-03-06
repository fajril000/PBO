public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 30);
        System.out.println("Rectangle:");
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println();

        Circle circle = new Circle(7);
        System.out.println("Circle:");
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println();

        Triangle triangle = new Triangle(10, 15);
        System.out.println("Triangle:");
        triangle.calculateArea();
        triangle.calculatePerimeter();
        System.out.println();
    }
}

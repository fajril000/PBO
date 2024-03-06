class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
        super.calculateArea();
    }

    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
        super.calculatePerimeter();
    }
}

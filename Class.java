class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
        super.calculateArea();
    }

    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        super.calculatePerimeter();
    }
}

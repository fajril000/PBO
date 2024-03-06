class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        area = 0.5 * base * height;
        super.calculateArea();
    }

    public void calculatePerimeter() {
        perimeter = 3 * base;
        super.calculatePerimeter();
    }
}

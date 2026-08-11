public class RectangleShape extends Shape {
    private double width, height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        RectangleShape r = new RectangleShape(5, 4);
        r.display();
        System.out.println("Area: " + r.area());
    }
}

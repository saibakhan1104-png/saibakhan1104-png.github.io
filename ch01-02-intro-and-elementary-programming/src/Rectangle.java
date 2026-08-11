import java.text.DecimalFormat;

class Rectangle {
    public static void main(String[] args) {

        double width = 4.5;
        double height = 7.9;
        double area = width * height;

	DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Area: " + df.format(area));

    }

}

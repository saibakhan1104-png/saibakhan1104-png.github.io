import java.text.DecimalFormat;

class CommandLine {
    public static void main(String[] args) {

            double width = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            double area = width * height;
            
            DecimalFormat df = new DecimalFormat("0.000");
	
            System.out.println("Area: " + df.format(area));

    }
}

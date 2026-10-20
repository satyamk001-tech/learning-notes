import java.util.*;

public class varhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first 3 numbers (can be int or decimal)
        System.out.println("Enter three numbers (a, b, c):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (a + b + c) / 3;   // average
        double area = a * a;          // square of a

        byte f = 4;
        char g = 'g';
        short h = 512;
        int i = 1000;
        float j = 3.14f;
        double k = 99.9954;

        double result = ((j * f) + (i % g) - (k * h));

        // Taking cost inputs
        System.out.println("Enter price of pencil, pen and eraser:");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float cp = pencil + pen + eraser;  // cost price
        float sp = (118 * cp) / 100;       // selling price with 18% GST

        // Output
        System.out.println("Selling Price with GST: " + sp);
        System.out.println("Area (a*a): " + area);
        System.out.println("Average of a, b, c: " + d);
        System.out.println("Result of expression: " + result);

        sc.close();
    }
}


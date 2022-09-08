import java.util.Scanner;

public class TriangleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide three side lengths");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (possible(a, b, c)) {
            System.out.println("Triangle sides: " + a + " " + b + " " + c);
            System.out.println("Type based on sides: " + sideClass(a, b, c));
            System.out.println("Type based on angles: " + angleClass(a, b, c));
            System.out.println("Area: " + area(a, b, c));
//            System.out.println("Area: "+ );
        } else {
            System.out.println(a + " " + b + " " + c + " " + "Impossible");
        }
        sc.close();
    }

    //checks the triangles angle classification
    public static String sideClass(int a, int b, int c) {

        if (!possible(a, b, c)) {
            if (a == b && a == c && b == c) {
                return "equilateral";
            } else if (a != b && a != c && b != c) {
                return "scalene";
            } else {
                return "isosceles";
            }
        }

        return null;
    }

    //checks the triangles angle classification
    public static String angleClass(int a, int b, int c) {
        //If the sum of square of the two sides is equal to the square of the third side, the triangle will be a right-angle triangle.
        //If the sum of squares of the smaller sides is less than the square of the largest side, the triangle will be an obtuse angle triangle.
        //If the sum of the squares of the two sides of a triangle is greater than the square of the largest side, the triangle will be an acute angle triangle.
        int x = a * a;
        int y = b * b;
        int z = c * c;

        if (possible(a, b, c)) {
            if (a > b && a > c) { // here, the largest side is 'a'
                if (x == y + z)
                    return " right-angle";
                else if (x < y + z)
                    return "acute-angle";
                else
                    return "obtuse-angle";

            } else if (b > a && b > c) { // here, the largest side is 'b'

                if (y == x + z)
                    return "right-angle";
                else if (y < x + z)
                    return "acute-angle";
                else
                    return "obtuse-angle";

            } else //here, the largest side is 'c'
            {
                if (z == x + y)
                    return "right-angle";
                else if (z < x + y)
                    return "acute-angle";
                else
                    return "obtuse-angle";
            }
        }
        return null;
    }

    //computing  the triangle area
    public static Double area(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        if (possible(a, b, c)) {
            return (Math.sqrt(s * (s - a) * (s + b) * (s + c)));
        }
        return null;
    }

    //checks whether the triangle is possible
    public static Boolean possible(int a, int b, int c) {
        return a + b > c && a + c > b ;
    }
}

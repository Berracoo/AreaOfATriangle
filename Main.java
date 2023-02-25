import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // taking input from users via Scanner class
       Scanner len = new Scanner(System.in);
        System.out.print("Please choose the first side length of the triangle : ");
        int a = len.nextInt();
        System.out.println();
        System.out.print("Please also choose the second side length of the triangle : ");
        int b = len.nextInt();
        System.out.println();
        System.out.print("Lastly please enter the third side length og the triangle : ");
        int c = len.nextInt();
        System.out.println();
        len.close();
        int u = (a + b + c) / 2;
        int circumference = 2 * u;
       int number = u * (u - a) * (u - b) * (u - c);
        double t;

        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        System.out.println(" Area of the triangle is : " + squareRoot + " " +
            "and" + " Circumferences of the triangle : " + circumference);
        // you can also easily find it without loop with the below code.
       /* double area = (int) Math.sqrt(number);
         System.out.println("Area of the triangle is : " + area + " " + "and" + " " +
                 "Circumferences of the triangle is : " + circumference);*/

    }
}
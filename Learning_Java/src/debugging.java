import java.util.Scanner;

//refer to github linkedinlearning 4.01b, 4.02b, 4.03b to restart practice problem

public class debugging {

    public static void main(String[] args) {

        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);

    }
}

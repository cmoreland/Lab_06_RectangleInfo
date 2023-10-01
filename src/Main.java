import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean doneW = false;
        int width = 0;
        int length = 0;
        do {
            System.out.println("Enter width of rectangle: ");
            if (in.hasNextInt()){
                width = in.nextInt();
                in.nextLine();
                doneW = true;
            }
            else{
                String trash = in.nextLine();
                System.out.println("You said " + trash + " and that's not the right input. Try again.");
            }
        }while (!doneW);

        boolean doneL = false;
        do {
            System.out.println("Enter length of rectangle: ");
            if (in.hasNextInt()){
                length = in.nextInt();
                in.nextLine();
                doneL = true;
            }
            else{
                String trash = in.nextLine();
                System.out.println("You said " + trash + " and that's not the right input. Try again.");
            }
        }while (!doneL);

        int area = length * width;
        int peri = (2 * length) + (2 * width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("The area of your rectangle is " + area + " square units.");
        System.out.println("The perimeter of your rectangle is " + peri + " units.");
        System.out.println("The diagonal of your rectangle is " + diagonal + " units.");

    }
}
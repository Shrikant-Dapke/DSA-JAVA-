/* Enter cost of 3 items from the user(using float datatype)-a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.Scanner;
public class Total{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the cost of pencil: ");
            float pencil = sc.nextFloat();

            System.out.print("Enter the cost of pen: ");
            float pen = sc.nextFloat();

            System.out.print("Enter the cost of eraser: ");
            float eraser = sc.nextFloat();

            float total = pencil + pen + eraser;
            float gst = total * 0.18f;

            System.out.println("The total cost before GST is: " + total);
            System.out.println("The GST amount (18%) is: " + gst);
            System.out.println("The total cost after adding GST is: " + (total + gst));
        }
}

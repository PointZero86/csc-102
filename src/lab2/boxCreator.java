package lab2;
import java.util.Scanner;
/**
 * Class that allows the creation of a box and calculating its volume.
 * @author Jorge Luis Pabon
 * @version 1.0 ...
 */
public class boxCreator {
    private double volume;
    private final double width;
    private final double height;
    private final double length;

    /**
     * Constructor for a box object.
     * @param width width of the box
     * @param height height of the box
     * @param length length of the box
     */
    public boxCreator(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    /**
     * Calculates the volume of a box.
     * @param volume volume of the box
     */
    public void calculateVolume() {
        volume = width * height * length;
    }

    /**
     * Returns the volume of a box.
     * @return volume of the box
     */
    public double getVolume() {
        return volume;
    }

    // Example Of Usage
    public static void main(String[] args) {
        double width, height, length;
        Scanner input = new Scanner(System.in);
        int sentinel = 1;
        while (sentinel == 1) {
            System.out.println("Please Enter The Width Of The Box: ");
            width = input.nextDouble();
            System.out.println("Please Enter The Height Of The Box: ");
            height = input.nextDouble();
            System.out.println("Please Enter The Length Of The Box: ");
            length = input.nextDouble();
            boxCreator box = new boxCreator(width, height, length);
            box.calculateVolume();
            System.out.println("The Volume Of Your Box Is: " + box.getVolume());
            System.out.println("Enter [0] To Exit Or [1] To Make Another Box: ");
            sentinel = input.nextInt();
        }
    }
}

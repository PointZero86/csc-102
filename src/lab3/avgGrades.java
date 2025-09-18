package lab3;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Class that allows the user to enter grades and see
 * the highest, lowest, and average of them all.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class avgGrades {
    ArrayList<Double> grade;
    double highest;
    double lowest = 100;

    /**
     * Constructor for avgGrades objects.
     * @param grade array-list of grades
     */
    avgGrades(ArrayList<Double> grade) {
        this.grade = grade;
    }

    /**
     * Method to store the worst and best grade.
     */
    public void storeWorstBest() {
        for (double num : grade) {
            if (num > highest) {
                highest = num;
            } else if (num < lowest && num >= 0) {
                lowest = num;
            }
        }
    }

    /**
     * Get the highest grade
     * @return highest grade
     */
    public double getHighest() {
        return highest;
    }

    /**
     * Get the lowest grade
     * @return lowest grade
     */
    public double getLowest() {
        return lowest;
    }

    /**
     * Calculate the average of all grades
     * @return average of all grades
     */
    public double calcAverage() {
        double avg = 0;
        for (double num : grade) {
            avg += num;
        }
        return Math.round(avg / grade.size());
    }

    // Example Usage
    public static void main(String[] args) {
        ArrayList<Double> gradeSheet = new ArrayList<>();
        String[] Options = {"Enter Grades Manually", "Search For File"};
        int Choice = JOptionPane.
                showOptionDialog(null, "What Would You Like To Do?",
                        "Grade Machine 401", 0, 3,
                        null, Options, null);
        // Manual Input
        if (Choice == 0) {
            for (int i = 1; i <= 10; i++) {
                gradeSheet.add(Double.parseDouble(JOptionPane.showInputDialog("Please Enter Grade #" + i)));
            }
            avgGrades Rubric = new avgGrades(gradeSheet);
            Rubric.storeWorstBest();
            double avg = Rubric.calcAverage();
            JOptionPane.showMessageDialog(null, "Highest: "
                    + Rubric.getHighest() + "\nLowest: " + Rubric.getLowest() + "\nAverage: " + avg);
        }
    }
}
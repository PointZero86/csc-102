package lab3;

import javax.swing.*;

public class exampleGuideVote {
    public static void main(String[] args) {
        int age;
        String response;
        response = JOptionPane.showInputDialog("How old are you..");
        age = Integer.parseInt(response);
        if (age >= 18) {
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You're too small to vote..");
        }
    }
}

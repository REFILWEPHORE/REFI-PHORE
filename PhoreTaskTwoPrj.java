package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author REFILWE PHORE ST10458818
 */
public class PhoreTaskTwoPrj {
//create the leaner object
    


    public static void main(String[] args) {

        //call method to get user input
        getLeanerInput();

        //call method to calculate and dispaly the final mark
        displayFinalMark();

    }

    // a method to promt the user for input
    public static void getLeanerInput() {
    JOptionPane.showInputDialog("Enter full name");
      JOptionPane.showInputDialog("Enter subject");
    Integer.parseInt(JOptionPane.showInputDialog("How much did the learner get in assignment"));
     Integer.parseInt(JOptionPane.showInputDialog("How much did the learner get in test one"));
      Integer.parseInt(JOptionPane.showInputDialog("How much did the leaner get in Exam"));

    }

    // a method to display final mark
    public static void displayFinalMark() {
     

        JOptionPane.showInputDialog("Enter FinalMark");

    }
}



import javax.swing.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {


        String birthdate = JOptionPane.showInputDialog("Input your birth date \n" +
                "\nPlease make sure your Input in this format {DD/MM/YYYY}    ");
        UserInput ob = new UserInput(birthdate);


    }

}
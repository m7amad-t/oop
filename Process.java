import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;

public class Process {

    UserInput userInput = new UserInput();
    LocalDate now = LocalDate.now();
    Calendar c = Calendar.getInstance();
    LocalDate birthdate = LocalDate.of(userInput.getYear(), userInput.getMonth(), userInput.getDay());
    Period p = Period.between(birthdate, now);
    public void yearOutPut() {
        JOptionPane.showMessageDialog(null,"Year ::  " +p.getYears());
    }

    public void monthOutPut() {
        int month = p.getYears()*12;
        month +=p.getMonths();
        JOptionPane.showMessageDialog(null,"Month ::  " +month);
    }

    public void weekOutPut() {
        int week = (int)(p.getYears()*52.352857142);

        JOptionPane.showMessageDialog(null, "Week ::  "+week );
    }

    public void dayOutPut() {
        int day = (int)((p.getYears()*52.352857142)*7);
        JOptionPane.showMessageDialog(null, "day :: " +day);
    }

}

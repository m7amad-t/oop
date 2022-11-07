import javax.swing.*;

public class UserInput {

    private static int year, month, day;

    public UserInput(){

    }
    public UserInput(String birthdate) {
        try {
            userDay(birthdate);
            userMonth(birthdate);
            userYear(birthdate);
            if (getDay() >= 1 && getDay() <= 31 && birthdate.charAt(2) == '/' && birthdate.charAt(5) == '/') {
                if (getMonth() >= 1 && getMonth() <= 12) {
                    try{
                        Process p = new Process();
                        int q1 =Integer.parseInt( JOptionPane.showInputDialog("do you want to see your age in ?\n1. in year\n2. in months\n3. in weeks\n4. days"));
                        if (q1 == 1){
                            p.yearOutPut();
                        }else if (q1 == 2 ){
                            p.monthOutPut();
                        }else if (q1 == 3){
                            p.weekOutPut();
                        }else if (q1 == 4){
                            p.dayOutPut();
                        }}catch (Exception e ){
                        JOptionPane.showMessageDialog(null ,"Your Input is wrong !");
                    }
                } else {
                    int i = 1 / 0;
                }
            } else {int i = 1 / 0;}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have been Input wrong date");
        }


    }

    private void userDay(String birthdate) {
        String temp = birthdate.charAt(0) + "" + birthdate.charAt(1);
        this.day = Integer.parseInt(temp);
    }

    private void userMonth(String birthdate) {
        String temp = birthdate.charAt(3) + "" + birthdate.charAt(4);
        this.month = Integer.parseInt(temp);
    }

    private void userYear(String birthdate) {
        String temp = "";
        for (int i = 6; i < 10; i++) {
            temp += birthdate.charAt(i) + "";
        }
        this.year = Integer.parseInt(temp);
    }

    public  int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }


}

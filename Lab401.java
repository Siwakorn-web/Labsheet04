import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {

        String fulllname, firstname = "", lastname = "";
        boolean check = false;
        do{
            fulllname = JOptionPane.showInputDialog("Enter your full name: ");
            fulllname = fulllname.trim();
            int space = fulllname.indexOf(" ");
            if (space >= 1){
                firstname = fulllname.substring(0,space);
                lastname = fulllname.substring(space);
                lastname = lastname.toUpperCase();
                check = true;


            }



        }while (!check);

        JOptionPane.showMessageDialog(null,"Welcome, " + firstname + lastname);

    }
}

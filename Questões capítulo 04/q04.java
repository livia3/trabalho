package QuestoesCap04;

import javax.swing.JOptionPane;
public class q04 {

    public static void main(String[] args) {

        double nt1, nt2, nt3, media;

        nt1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
        nt2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
        nt3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3:"));

        if (nt1 > nt2 && nt1 > nt3) {
            System.out.print(nt1);
        } else if (nt2 > nt1 && nt2 > nt3) {
            System.out.print(nt2);
        } else if (nt3 > nt1 && nt3 > nt2) {
            System.out.print(nt3);
        } else {System.out.println("Empate");}
    }
}

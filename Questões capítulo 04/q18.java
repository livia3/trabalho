package QuestoesCap04;

import javax.swing.JOptionPane;

public class q18 {

    public static void main(String[] args) {
        int i, m;
        m = 18;
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade? "));
        if (i >= m) {
            JOptionPane.showMessageDialog(null, "Você já e de maior");

        } else {
            JOptionPane.showMessageDialog(null, "Você ainda não é de maior");
        }
    }

}
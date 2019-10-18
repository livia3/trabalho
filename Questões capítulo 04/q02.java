package QuestoesCap04;

import javax.swing.JOptionPane;

public class q02 {

    public static void main(String[] args) {

        double n1, n2, m;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 1ª nota? "));

        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 2ª nota? "));
        m = (n1 + n2) / 2;
        if (m >= 7) {
            JOptionPane.showMessageDialog(null, "Você foi aprovado");
        } else {
            if (m >= 3) {
                JOptionPane.showMessageDialog(null, "Você está em exame");

            } else {
                JOptionPane.showMessageDialog(null, "Você está foi reprovado");

            }
        }
    }

}
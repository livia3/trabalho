package QuestoesCap04;


import javax.swing.JOptionPane;

public class q01 {

    public static void main(String[] args) {
        double n1, n2, n3, n4, m;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 1ª nota? "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 2ª nota? "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 3ª nota? "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a 4ª nota? "));
        m = (n1 + n2 + n3 + n4) / 4;
        if (m >= 7) {
            JOptionPane.showMessageDialog(null, "Você foi aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Você foi reprovado");
        }
    }

}
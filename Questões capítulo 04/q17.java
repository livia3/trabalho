package QuestoesCap04;

import javax.swing.JOptionPane;

public class q17 {

    public static void main(String[] args) {
        int s, su;
        s = 4531;
        su = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha: "));
        if (s == su) {
            JOptionPane.showMessageDialog(null, "Acessa permitido");
        } else {
            JOptionPane.showMessageDialog(null, "Acessa Negado");

        }
    }
}

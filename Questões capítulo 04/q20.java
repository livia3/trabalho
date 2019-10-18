package QuestoesCap04;

import javax.swing.JOptionPane;

public class q20 {

    public static void main(String[] args) {
        int i;
        String r;
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade? "));
        if (i > 30) {
            r = "Sênior";
        } else {
            if (i >= 16) {
                r = "é um Nadador Adulto";
            } else {
                if (i >= 11) {
                    r = "é um Nadador Adolescente";
                } else {
                    if (i >= 8) {
                        r = "é um Nadador Juvenil";
                    } else {
                        if (i >= 5) {
                            r = "é um Nadador Infantil";
                        } else {
                            r = "não é um nadador";
                        }

                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Você "+r);
    }
}
package Questoes;

import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        double i = 0, pi = 0, lm = 0;
        i = 120;
        pi = 5;
        lm = (i * pi)-200;
        JOptionPane.showMessageDialog(null, " Preço do ingresso: R$" + pi + "\n Quantidade de Ingressos: " + i + "\n Lucro máximo com os Ingressos: R$" + lm);
        for (int j = 0; j < 9; j++) {
            i += 26;
            pi -= 0.50;
            lm = (i * pi)-200;
            JOptionPane.showMessageDialog(null, " Preço do ingresso: R$" + pi + "\n Quantidade de Ingressos: " + i + "\n Lucro máximo com os Ingressos: R$" + lm);

        }

    }

}

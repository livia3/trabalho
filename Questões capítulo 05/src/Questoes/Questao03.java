package Questoes;

import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        double p = 0, a = 0, j = 0, ad = 0, adv = 0, vovo = 0, p1 = 0, p2 = 0;

        for (int i = 0; i < 8; i++) {
            p = Double.parseDouble(JOptionPane.showInputDialog("Informe a idade de uma pessoa: "));
            if (p <= 15) {
                a++;
            } else {
                if (p <= 30) {
                    j++;
                } else {
                    if (p <= 45) {
                        ad++;
                    } else {
                        if (p <= 60) {
                            adv++;
                        } else {
                            vovo++;
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas na 1ª faixa etária é: " + a);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas na 2ª faixa etária é: " + j);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas na 3ª faixa etária é: " + ad);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas na 4ª faixa etária é: " + adv);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas na 5ª faixa etária é: " + vovo);
        p1 = (100 / 8) * a;
        p2 = (100 / 8) * vovo;
        if (p2 == 0) {
            p1 = p1 + 4;
        } else {
            if (p1 == 0) {
                p2 = p2 + 4;
            } else {
                p1 = p1 + 2;
                p2 = p2 + 2;
            }
        }
        JOptionPane.showMessageDialog(null, "A porcentagem de pessoas na primeira categoria é: " + p1 + "%");
        JOptionPane.showMessageDialog(null, "A porcentagem de pessoas na última categoria é: " + p2 + "%");

    }

}

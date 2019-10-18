package Questoes;

import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        for (int i = 0; i != 4; i++) {

            int a[] = new int[4];
            JOptionPane.showMessageDialog(null, "Informe 4 números: ");
            for (int u = 0; u != 4; u++) {
                a[u] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            }
            JOptionPane.showMessageDialog(null, "Os números na ordem em que você digitou:  ");
            for (int u = 0; u != 4; u++) {
                JOptionPane.showMessageDialog(null, a[u]);
            }
            int aux;

            for (int u = 0; u != 4; u++) {
                for (int j = 0; j != 4; j++) {
                    if (a[u] < a[j]) {
                        aux = a[u];
                        a[u] = a[j];
                        a[j] = aux;

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Os números em ordem crescentes:  ");

            for (int s = 0; s != 4; s++) {
                JOptionPane.showMessageDialog(null, a[s]);
            }
            JOptionPane.showMessageDialog(null, "Os números em ordem decrescentes:  ");

            for (int t = 0; t != 4; t++) {
                for (int j = 0; j != 4; j++) {
                    if (a[t] > a[j]) {
                        aux = a[t];
                        a[t] = a[j];
                        a[j] = aux;

                    }
                }
            }
            for (int u = 0; u != 4; u++) {
                JOptionPane.showMessageDialog(null, a[u]);
            }
        }

    }
}
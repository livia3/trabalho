package capitulo05;

import javax.swing.JOptionPane;

public class quest24 {

    public static void main(String[] args) {
        int cont = 1, maior = 0, menor = 1, num;
        while (cont != 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("VALOR INTEIRO POSITIVO:"));
            if (num > 0) {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            } else if (num == 0) {
                cont = 0;
            } else {
                JOptionPane.showMessageDialog(null, "OPERAÇÃO INVALIDA");
            }
        }
        JOptionPane.showMessageDialog(
                null, "Maior Numero: " + maior + "\n"
                + "Menor Numero: " + menor + "\n");
    }
}

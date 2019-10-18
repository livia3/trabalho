package cap05;

import javax.swing.JOptionPane;

public class questao10 {

    public static void main(String[] args) {
        int impar = 0, par = 0, numero;
        int c = 0;
        while (c != 10) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

            if ((numero % 2) == 0) {
                par += numero;
            } else {
                impar += numero;
            }

            c++;

        }
        JOptionPane.showMessageDialog(null, "a soma dos números pares é: "+par);
        JOptionPane.showMessageDialog(null, "a soma dos números impares é: "+impar);
    }
}

package cap05;

import javax.swing.JOptionPane;

public class questao12 {

    public static void main(String[] args) {
        int c = 0, numero;
        int impar = 0;
        while (c != 10) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            if ((numero % 2) == 1) {
                impar++;
            }
            c++;
        }
        JOptionPane.showMessageDialog(null, "O total de números impares é: " + impar);

    }

}

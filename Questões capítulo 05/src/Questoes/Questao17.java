package questões.capítulo.pkg05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class q17 {

    public static void main(String[] args) {
        int c = 1;
        double canal4 = 0, canal5 = 0, canal7 = 0, canal10 = 0, canal13 = 0, totalCanais = 0;
        double percentualCanal4, percentualCanal5, percentualCanal7, percentualCanal10, percentualCanal13;
        DecimalFormat e= new DecimalFormat();
        e.format(0.00);
        while (c != 0) {
            c = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal"));
            switch (c) {
                case 4:
                    canal4++;
                    totalCanais++;
                    break;
                case 5:
                    canal5++;
                    totalCanais++;
                    break;
                case 7:
                    canal7++;
                    totalCanais++;
                    break;
                case 10:
                    canal10++;
                    totalCanais++;
                    break;
                case 13:
                    canal13++;
                    totalCanais++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Canal inválido");
                    break;
            }
        }
        percentualCanal4 = (canal4 * 100) / totalCanais;
        percentualCanal5 = (canal5 * 100) / totalCanais;
        percentualCanal7 = (canal7 * 100) / totalCanais;
        percentualCanal10 = (canal10 * 100) / totalCanais;
        percentualCanal13 = (canal13 * 100) / totalCanais;

        JOptionPane.showMessageDialog(null, "O Percentual de audiencia do canal 4 é: " + e.format(percentualCanal4));
        JOptionPane.showMessageDialog(null, "O Percentual de audiencia do canal 5 é: " + e.format(percentualCanal5));
        JOptionPane.showMessageDialog(null, "O Percentual de audiencia do canal 7 é: " + e.format(percentualCanal7));
        JOptionPane.showMessageDialog(null, "O Percentual de audiencia do canal 10 é: " + e.format(percentualCanal10));
        JOptionPane.showMessageDialog(null, "O Percentual de audiencia do canal 13 é: " + e.format(percentualCanal13));

    }
}

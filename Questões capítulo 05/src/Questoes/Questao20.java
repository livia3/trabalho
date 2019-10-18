package capitulo05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class quest20 {

    public static void main(String[] args) {
        int opc = 0, meses;
        double nt1, nt2, nt3, media, pes1, pes2, pes3;
        DecimalFormat df = new DecimalFormat("0.0");

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Média Aritimetica\n"
                    + "2 - Média Poderada\n"
                    + "3 - Sair\n"));
            switch (opc) {
                case 1:
                    nt1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1 "));
                    nt2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2 "));
                    media = (nt1 + nt2) / 2;
                    JOptionPane.showMessageDialog(null, "Sua média é: " + df.format(media));
                    break;
                case 2:
                    nt1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1 "));
                    pes1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso 1 "));
                    nt2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2 "));
                    pes2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso 2 "));
                    nt3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3 "));
                    pes3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso 3 "));
                    media = ((nt1 * pes1) + (nt2 * pes2) + (nt3 * pes3)) / (pes1 + pes2 + pes3);
                    JOptionPane.showMessageDialog(null, "Sua média é: " + df.format(media));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "OBRIGADO, ATÉ A PROXIMA");
                    break;

            }

        }
    }
}

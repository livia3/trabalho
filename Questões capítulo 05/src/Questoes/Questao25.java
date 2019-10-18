package capitulo05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class quest25 {

    public static void main(String[] args) {
        int tipoInvest, code = 1;
        double valorFinal = 0, valorInvest;
        DecimalFormat df = new DecimalFormat("0.00");
        while (code != 0) {

            code = Integer.parseInt(JOptionPane.showInputDialog("CÓDIOGO DO CLIENTE:"));
            if (code != 0 ) {
                tipoInvest = Integer.parseInt(JOptionPane.showInputDialog("TIPO DE INVESTIMENTO:\n"
                        + "1 - Puoança\n"
                        + "2 - Poupança plus\n"
                        + "3 - Fundos de renda fixa\n"));
                valorInvest = Double.parseDouble(JOptionPane.showInputDialog("VALOR DO INVESTIMENTO R$"));
                switch (tipoInvest) {
                    case 1:
                        valorFinal = (((valorInvest * 1.5) / 100) + valorInvest);
                        break;
                    case 2:
                        valorFinal = (((valorInvest * 2) / 100) + valorInvest);
                        break;
                    case 3:
                        valorFinal = (((valorInvest * 4) / 100) + valorInvest);
                        break;
                }
                JOptionPane.showMessageDialog(null, "RENDA MENSAL R$" + df.format(valorFinal));
            } else {
                JOptionPane.showMessageDialog(null, "OBRIGADO, ATÉ A PROXIMA");

            }

        }
    }
}

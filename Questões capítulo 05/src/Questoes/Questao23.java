package capitulo05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class quest23 {

    public static void main(String[] args) {
        int opc = 0, meses;
        double salario, novoSalario;
        DecimalFormat df = new DecimalFormat("0.00");

        while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Novo salario\n"
                    + "2 - Férias\n"
                    + "3 - Décimo terceiro\n"
                    + "4 - Sair\n"));
            switch (opc) {
                case 1:
                    salario = Integer.parseInt(JOptionPane.showInputDialog("SALARIO: R$"));
                    if (salario <= 210) {
                        novoSalario = (((salario * 15) / 100) + salario);
                    } else if (salario <= 600) {
                        novoSalario = (((salario * 10) / 100) + salario);

                    } else {
                        novoSalario = (((salario * 5) / 100) + salario);
                    }
                    JOptionPane.showMessageDialog(null, "NOVO SALÁRIO R$" + df.format(novoSalario));
                    break;
                case 2:
                    salario = Integer.parseInt(JOptionPane.showInputDialog("SALARIO: R$"));
                    novoSalario = ((salario / 3) + salario);
                    JOptionPane.showMessageDialog(null, "SUAS FERIAS VALEM R$" + df.format(novoSalario));
                    break;
                case 3:
                    salario = Double.parseDouble(JOptionPane.showInputDialog("SALARIO: R$"));
                    meses = Integer.parseInt(JOptionPane.showInputDialog("MESES DE TRABALHO:"));
                    novoSalario = ((salario * meses) / 12);
                    JOptionPane.showMessageDialog(null, "DERCIMO TERCEIRO R$" + df.format(novoSalario));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "OBRIGADO, ATÉ A PROXIMA");
                    break;

            }

        }

    }
}

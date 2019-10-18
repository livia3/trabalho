package QuestoesCap04;

import javax.swing.JOptionPane;

public class q05 {

    public static void main(String[] args) {

        double num, num1, num2, num3, num4, r;
        JOptionPane.showMessageDialog(null, "Menu: \n 1-Média entre os números \n 2-Diferença do maior pelo menor \n"
                + " 3-Produto dos números\n"
                + " 4- Divisão do primeiro pelo segundo");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual "
                + "opção você deseja seguir? "));
        if (num == 1) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 1º número? "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 2º número? "));
            num3 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 3º número? "));
            num4 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 4º número? "));
            r = (num1 + num2 + num3 + num4) / 4;
            JOptionPane.showMessageDialog(null, "A média entre os números é: " + r);
        } else {
            if (num == 2) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 1º número: "));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 2º número: "));
                if (num1 > num2) {
                    r = num1 - num2;
                } else {
                    r = num2 - num1;
                }
                JOptionPane.showMessageDialog(null, "A diferença do maior para o menor é: " + r);
            } else {
                if (num == 3) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 1º: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 2º: "));
                    r = num1 * num2;
                    JOptionPane.showMessageDialog(null, "O produto entre os números é: " + r);
                } else {
                    if (num == 4) {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 1º número: "));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o 2º número: "));
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(null, "O segundo número não pode ser 0");
                        } else {
                            r = num1 / num2;
                            JOptionPane.showMessageDialog(null, "A divisão do primeiro pelo segundo é: " + r);
                        }
                    }
                }
            }
        }

    }

}
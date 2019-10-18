package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao6 {

    public static void main(String[] args) {
        //variaveis
        double sal, conta1, conta2, salF, conta1F, conta2F;
        sal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário"));
        conta1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira conta"));
        conta2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda conta"));
        conta1F = conta1 + (conta1 * 0.02);
        conta2F = conta2 + (conta2 * 0.02);
        salF = sal - conta1F - conta2F;
        JOptionPane.showMessageDialog(null, "do salário incial, restará: R$" + salF);

    }
}

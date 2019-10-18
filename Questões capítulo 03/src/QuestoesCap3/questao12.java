package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao12 {
    public static void main(String[] args) {
        double salarioMin; double salario; double resul;
        salarioMin = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário mínimo"));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do funcionário"));
        resul = salario/salarioMin;
        JOptionPane.showMessageDialog(null, "O funcionário recebe "+resul+" salários mínimos");
    }
    
}

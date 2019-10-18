package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao5 {
    public static void main(String[] args) {
        double resul;
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o valor do produto","0"));
        //processamento de dados
        resul = num1 - ((num1 * 10)/100);
        
        //saída de dados
        JOptionPane.showMessageDialog(null, "O novo preço é: R$ " +resul);
    }
}

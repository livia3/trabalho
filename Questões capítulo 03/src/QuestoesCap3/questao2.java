package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao2 {
        public static void main(String[] args) {
        int resul;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"selsecione o primeiro número","0"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"selsecione o segundo número", "0"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"selsecione o terceiro número", "0"));
        //processamento de dados
        resul = num1 * num2 * num3;
        
        //saída de dados
        JOptionPane.showMessageDialog(null, "O resultado foi:" +resul);
        
    }
    
}

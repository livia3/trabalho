
package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao3 {
    public static void main(String[] args) {
        float resul;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"selsecione o primeiro número","0"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"selsecione o segundo número", "0"));
        //processamento de dados
        resul = (num1 / (num2 * 1.0f));
        
        //saída de dados
        JOptionPane.showMessageDialog(null, "O resultado foi:" +resul);   
}
}
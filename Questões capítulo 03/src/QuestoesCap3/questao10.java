package QuestoesCap3;

import javax.swing.JOptionPane;
public class questao10 {
    public static void main(String[] args) {
        double resul;double lado;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho dos lados do quadrado"));
        resul = lado * lado;
        JOptionPane.showMessageDialog(null,"A área do quadrado é: "+resul);
    }
    
}

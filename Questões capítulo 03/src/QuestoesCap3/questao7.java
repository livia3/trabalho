package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao7 {
    public static void main(String[] args) {
        double peso; double pesoMa; double pesoMe;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso:","0"));
        
        pesoMa = peso +((peso * 15)/100);
        pesoMe = peso - ((peso * 20)/100);
        
        JOptionPane.showMessageDialog(null,"Se aumentar seu peso em 15%, ficará com "+pesoMa+"Kg");
        JOptionPane.showMessageDialog(null,"Se diminuir seu peso em 20%, ficará com "+pesoMe+"Kg");
    }
    
}

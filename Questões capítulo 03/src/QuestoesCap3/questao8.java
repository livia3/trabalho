package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao8 {
    public static void main(String[] args) {
        double peso;
        peso= Double.parseDouble(JOptionPane.showInputDialog(null,"Informe seu peso em KG"));
        JOptionPane.showMessageDialog(null, "seu peso em Kg:" +peso+ "kg em gramas:"+(peso*1000)+"g");
    }
}

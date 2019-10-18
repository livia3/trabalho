package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao9 {
    public static void main(String[] args) {
        double baseMa;double baseMe;double altura;double area;
        baseMa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base maior do trapézio"));
        baseMe = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base menor do trapézio"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do trapézio"));
        area = (baseMa+baseMe)*altura/2;
        JOptionPane.showMessageDialog(null, "A área do trapezio é: "+area);
    }
}

package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao11 {
    public static void main(String[] args) {
        double area;double diagMa;double diagMe;
        diagMa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a diagonal maior do losango"));
        diagMe = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a diagonal menor do losango"));
        area = (diagMa+diagMe)/2;
        JOptionPane.showMessageDialog(null, "A área do losango é: "+area);
    }
}

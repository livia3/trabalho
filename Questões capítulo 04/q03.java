

package QuestoesCap04;

import javax.swing.JOptionPane;

public class q03
{
    public static void main(final String[] args) {
        final double d1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º n\u00famero "));
        final double d2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º n\u00famero "));
        if (d1 < d2) {
            JOptionPane.showMessageDialog(null, "o menor n\u00famero \u00e9: " + d1);
        }
        else {
            JOptionPane.showMessageDialog(null, "o menor n\u00famero \u00e9: " + d2);
        }
    }
}

package Questoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Higor
 */
public class Questao05 {
 
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                JOptionPane.showMessageDialog(null, i+ "x" + j + "=" + i * j);
            }
        }
    }

}
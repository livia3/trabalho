package Questoes;

import javax.swing.JOptionPane;

public class Questao04 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe a tabuada: "));
            for (int j = 0; j < 11; j++) {
                JOptionPane.showMessageDialog(null, num+ "x" + j + "=" + num * j);
            }
        }
    }



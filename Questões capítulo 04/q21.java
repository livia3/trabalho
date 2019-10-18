package QuestoesCap04;

import javax.swing.JOptionPane;

public class q21 {

    public static void main(String[] args) {
        int p, c;
        String pro = null;
        p = Integer.parseInt(JOptionPane.showInputDialog("Qual o preço do produto? "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto? "));
        switch (c) {
            case 1:
                pro = "Sul";
                break;
            case 2:
                pro = "Norte";
                break;
            case 3:
                pro = "Leste";
                break;
            case 4:
                pro = "Oeste";
                break;
        }
        if (c == 5 || c == 6) {
            pro = "Nordeste";
        } else {
            if (c >= 7 || c <= 9) {
                pro = "Sudeste";
            } else {
                if (c >= 10 || c <= 20) {
                    pro = "Centro-oeste";
                } else {
                    if (c >= 21 || c <= 30) {
                        pro = "Nordeste";
                    }
                }

            }
        }
        JOptionPane.showMessageDialog(null,"A sua procedência é: "+pro);
    }

}
package Questoes;

import javax.swing.JOptionPane;

public class Questao06 {

    public static void main(String[] args) {
        int c = 0, p = 0, v = 0, s = 0;
        String cod;
        JOptionPane.showMessageDialog(null, "Menu: \n V: Á Vista \n P: Á Prazo ");
        for (int i = 0; i < 15; i++) {

            cod = JOptionPane.showInputDialog("Qual tipo de compra você quer realizar?");
            if (cod.equals("V")||cod.equals("v")) {
                c = Integer.parseInt(JOptionPane.showInputDialog("Qual valor da compra Á vista: "));
                v += c;
            } else {
                if (cod.equals("P")||cod.equals("p")) {
                    c = Integer.parseInt(JOptionPane.showInputDialog("Qual valor da compra Á prazo: "));
                    p += c;
                } else {
                    JOptionPane.showMessageDialog(null, "A opção escolhida não está no menu!");
                }
            }
        }
        s = v + p;
        JOptionPane.showMessageDialog(null, "O valor das compras a prazo é: " + p);
        JOptionPane.showMessageDialog(null, "O valor das compras a vista é: " + v);
        JOptionPane.showMessageDialog(null, "O valor total das compras é: " + s);

    }
}

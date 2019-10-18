package QuestoesCap3;

import javax.swing.JOptionPane;

public class questao14{
    public static void main(String[] args) {
        long anoN , anoA , meses , dia; double semana; long idade;
        anoN = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe seu ano de nascimento"));
        anoA = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano atual"));
        idade = anoA - anoN;
        meses = idade * 12;
        dia = (idade * 12)* 30;
        semana = (idade * 12) * 4;
        JOptionPane.showMessageDialog(null,"A sua idade é: "+idade+" anos");
        JOptionPane.showMessageDialog(null,"A sua idade é: "+meses+" meses");
        JOptionPane.showMessageDialog(null,"A sua idade é: "+dia+" dias");
        JOptionPane.showMessageDialog(null,"A sua idade é: "+semana+" semanas");
    }
}

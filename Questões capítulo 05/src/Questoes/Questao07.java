package cap05;

import javax.swing.JOptionPane;

public class questao07 {

    public static void main(String[] args) {
        double idade , peso , altura ;
        double somatorio  , medialt = 0, somida = 0, somp = 0, somal = 0;
        int ida = 0, alt = 0, ps = 0;
        int c = 0;

        while (c != 2) {
            idade = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade: "));
            if (idade > 50) {
                ida++;
            }else if (idade > 10 && idade < 20) {
                alt++;
            }
            
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
                if (peso < 40) {
                ps++;
            }
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
            somida += idade;
            somp += peso;
            somal += altura;
            medialt += altura;
            c++;
        }
        somatorio = somida + somp + somal;
        JOptionPane.showMessageDialog(null, "O somatorio vale: " + somatorio);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas com idade superior a 50 são: " + ida);
        JOptionPane.showMessageDialog(null, "A media das alturas é: " +(medialt / alt));
        JOptionPane.showMessageDialog(null, "A porcentagem de pessoas que tem peso inferor a 40kg é " +(ps*100/2)+" %");
    }

}
package QuestoesCap04;

import javax.swing.JOptionPane;

public class q08 {
    public static void main(String[] args) {
       int num, num1, num2, result;
       double numr, raiz;
        

        JOptionPane.showMessageDialog(null, "Menu: \n 1-Somar dois números \n 2-Raiz "
                + "quadrada de um número");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual "
                + "opção você deseja seguir? "));
        if (num==1) {
           num1 = Integer.parseInt( JOptionPane.showInputDialog("Qual o 1º número? "));
           num2 = Integer.parseInt( JOptionPane.showInputDialog("Qual o 2º número? "));
           result = num1+num2;
           JOptionPane.showMessageDialog(null, "A soma dos dois números é: "+result);
        }else{if (num==2) {
                numr = Double.parseDouble(JOptionPane.showInputDialog("Qual o número que você deseja fazer a raiz? "));
                raiz = Math.sqrt(numr);
                JOptionPane.showMessageDialog(null, "A raiz do número é: "+raiz);
            }else{
            JOptionPane.showMessageDialog(null, "A opção escolhida não está no Menu");
        }

        }
        
    } }
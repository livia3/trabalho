package QuestoesCap04;

import javax.swing.JOptionPane;

public class q19 {

    public static void main(String[] args){
    String s;
    double pi, a ;
  s = JOptionPane.showInputDialog("Qual o seu gênero: (M ou F)");
  a = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura? "));
        if ("M".equals(s)) {
            pi = (72.7*a)-58;
            
        }else{
            pi = (62.1*a)-44.7;
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+pi);
                
    }

}
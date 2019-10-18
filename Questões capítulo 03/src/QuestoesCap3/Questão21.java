package QuestoesCap3;

import javax.swing.JOptionPane;

public class Questão21 {
    public static void main(String[] args) {
        //variaveis
            double hrtb, hrex;
            double valor_hrtb, valor_hrex;
            double salario_bruto, salario_final, total_hrex, 
        //enteda
            salm = Double.parseDouble(JOptionPane.showInputDialog(null,"Salário:"));
            hrex = Double.parseDouble(JOptionPane.showInputDialog(null,"Horas extras:"));
        //processamento
           valor_hrtb = salm/8;
           valor_hrex = salm/8;
           salario_bruto = salm + valor_hrtb;
           total_hrex = hrex*valor_hrex;
           salario_final = salario_bruto + total_hrex;
        //saida
         JOptionPane.showMessageDialog (null,"Sera depositado em sua conta:" +salario_final);
      
    }
     
    
}

package QuestoesCap3;

import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        //variaveis
       double real, d, m, l;
       double dolar =1.80;
       double marco= 2.00;
       double libra=3.57;                                                                              
       Scanner e = new Scanner (System.in);
        //entrada
               System.out.println("Quanto você tem?(R$)");
               real = e.nextDouble();
        //processamento
        d = real*dolar;  
        m = real*marco;
        l = real*libra;
        //sida
        System.out.println("Isso Vale:");
        System.out.println("Dolar:"+d);
        System.out.println("M/Alemão:"+m);
        System.out.println("Libra:"+l);
        
               
               
    }
}

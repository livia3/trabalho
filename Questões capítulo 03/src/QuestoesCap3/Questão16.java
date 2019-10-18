
package QuestoesCap3;

import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        //variaveis
        double c1, c2, hpz;
        Scanner e = new Scanner(System.in);
        //enteda
        System.out.println("Cateto 1:");
            c1 = e.nextInt();
        System.out.println("Cateto 2:");
            c2 = e.nextInt();
       //Processamento
       hpz = Math.sqrt (Math.pow(c1,2)+ Math.pow(c2,2));
       //saida
      System.out.print("A hipotenuza vale:"+hpz);
    }
}

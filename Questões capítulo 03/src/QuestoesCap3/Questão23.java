
package QuestoesCap3;

import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        //variaveis
        int a1, a2, a3;
        int atri = 180;
        Scanner e = new Scanner(System.in);
        //entreda
        System.out.println("1º Ângulo:");
        a1= e.nextInt(); 
        System.out.println("2º Ângulo:");
        a2= e.nextInt();
                //processamento
                a3 = atri - (a1+a2);
                //saida
                System.out.println("O terceiro angulo do triângulo é:"+a3);
    
    
    
    }
}

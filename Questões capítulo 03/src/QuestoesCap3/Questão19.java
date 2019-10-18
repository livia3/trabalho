
package QuestoesCap3;

import java.util.Scanner;



public class Questão19 {
    public static void main(String[] args) {
        //variaveis
        Scanner e = new Scanner(System.in);
        double lado_a, lado_b, area, w;
        double potencia = 18;
        //entreda
        System.out.println("Lado 1:");
        lado_a = e.nextDouble();
        System.out.println("Lado 2:");
        lado_b = e.nextDouble();
        //processameeto
                area = lado_a * lado_b;
                w = area*potencia;
                //saida
          System.out.println("A area do Comodo é:"+area);
          System.out.println("A Voltagen Nescessaria para iluminalo é:"+w);
        
    }
 
}

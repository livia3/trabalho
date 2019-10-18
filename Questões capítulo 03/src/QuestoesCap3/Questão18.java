
package QuestoesCap3;

import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        //Variaveis
        double celc, fah;
        Scanner e = new Scanner(System.in);
        //entrada
        System.out.println("Imforme a temperetura(c°):");
        celc = e.nextDouble();
        //processamento
               fah = 180*(celc+32)/100;
                
        //saida
        System.out.println("A temperetura em Fahrenheit é:"+fah);
    }
 
}

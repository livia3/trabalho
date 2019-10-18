
package QuestoesCap3;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
//variaveis
Scanner e = new Scanner(System.in);
 int lados, nd;
//entrada
        System.out.println("Quantos lados tem o Poligno:");
        lados = e.nextInt();
        //processamento
        nd = lados  *(lados -3)/2;
        System.out.println("O seu Poligno Possui "+nd+ " diagonais.");
    }
}

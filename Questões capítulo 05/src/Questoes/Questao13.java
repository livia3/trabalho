package questões.capítulo.pkg05;

import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
        double p;
        int i, x;
        double y1 = 0, y2 = 0, y3 = 0, y4 = 0;
        double soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        double med1 = 0, med2 = 0, med3 = 0, med4 = 0;
        Scanner e = new Scanner(System.in);

        for (x = 1; x <= 15; x++) {
            System.out.println("\nDigite a idade da pessoa: ");
            i = e.nextInt();
            System.out.println("\n Digite o peso da  pessoa: ");
            p = e.nextDouble();
            if (i >= 1 && i <= 10) {
                y1 += 1;
                soma1 += p;
                med1 = soma1 / y1;
            }
            if (i >= 11 && i <= 20) {
                y2 += 1;
                soma2 += p;
                med2 = soma2 / y2;
            }
            if (i >= 21 && i <= 30) {
                y3 += 1;
                soma3 += p;
                med3 = soma3 / y3;

            }
            if (i >= 31) {
                y4 += 1;
                soma4 += p;
                med4 = soma4 / y4;
            }
        }
        System.out.println("a média de pessoas entre 0 e 10 é: " + med1);
        System.out.println("a média de pessoas entre 11 e 20 é: " + med2);
        System.out.println("a média de pessoas entre 21 e 30 é: " + med3);
        System.out.println("a média de pessoas acima de 30 é: " + med4);
    }

}

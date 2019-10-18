/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
           double sal, fim; int tipo;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o tipo de conta (1 = poupança; 2=fundos de renda fixa)");
        tipo = e.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Informe o valor");
                sal = e.nextDouble();
                fim = sal + (sal*0.03);
                System.out.println("No fim de 1 mês, resultará: R$"+fim);
                break;
            case 2:
                System.out.println("Informe o valor");
                sal = e.nextDouble();
                fim = sal + (sal*0.03);
                System.out.println("No fim de 1 mês, resultará: R$"+fim);
                break;
            default:
                System.out.println("Informe um valor válido");
                break;
        }

    }
}

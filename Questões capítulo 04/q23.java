/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class q23 {
    public static void main(String[] args) {
        String cod; int qnt, descV; double precU, precTN, desc,nota; 
        Scanner e= new Scanner (System.in);
        System.out.println("Informee o código do produto");
        cod = e.next();
        System.out.println("Informe a quantidade");
        qnt = e.nextInt();
        if (qnt <= 10){precU = 10;} else if (qnt <= 20){precU = 15;} else{
        if (qnt <= 20){precU = 30;} else if (qnt <= 40){precU = 30;} else {precU = 50;}
        } 
        precTN = precU * qnt;
        if (precTN <= 250){descV = 5; desc = precTN * 0.05;} else if (precTN <=500){descV = 10; desc = precTN * 0.1;}
        else {descV = 15; desc = precTN * 0.15;}
        nota = precTN - desc;
        System.out.println("Preço unitário de cada produto: R$"+precU);
        System.out.println("Valor total da nota: R$"+precTN);
        System.out.println("Valor do desconto: "+descV+"% (R$"+desc+")");
        System.out.println("Preço final: R$"+nota);
    }
}

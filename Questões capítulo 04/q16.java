/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
              double preco, fim, desc;
              String des;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o preço");
        preco = e.nextDouble();
        System.out.println("Informe o código do produto");
        String codig = e.next();
        if (preco <= 30) {fim = preco;desc=0;des="0%";}
        else if (preco <=100 ){desc = preco*0.1;fim = preco - desc;des="10%";}
        else {desc = preco * 0.15;fim=preco - desc;des="15%";}
        System.out.println("Código do produto:"+codig);
        System.out.println("O valor do desconto:"+des);
        System.out.println("Novo preço: R$"+fim);
    }
}

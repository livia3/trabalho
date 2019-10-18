/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        double preco, custoF; 
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o preço");
        custoF = e.nextDouble();
        if (custoF <=50) {preco = custoF + (custoF*0.05);}
        else if (custoF <= 100){preco = custoF + (custoF*0.1)+(custoF*0.15);}
        else {preco = custoF + (custoF*0.15)+(custoF*0.15);}
        
        if (preco<=80){System.out.println("Preço: R$"+preco+". Categoria: Barato.");}
        else {if (preco<=120){System.out.println("Preço: R$"+preco+". Categoria: Normal.");}
        else if (preco <= 200) {System.out.println("Preço: R$"+preco+". Categoria: Caro.");}
        else {System.out.println("Preço: R$"+preco+". Categoria: Muito Caro.");}
        }
        
        
    }
}

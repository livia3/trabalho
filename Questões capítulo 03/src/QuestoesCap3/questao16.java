/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap3;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class questao16 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    int cate1 , cate2 ; double hipo;
    System.out.println("Informe o 1º cateto");
    cate1 = entrada.nextInt();
    System.out.println("Informe o 2º cateto");
    cate2 = entrada.nextInt();
    hipo = Math.sqrt((Math.pow(cate1, 2)) + (Math.pow(cate2,2)));
        System.out.println("A hipotenusa vale:"+hipo);
}
    }

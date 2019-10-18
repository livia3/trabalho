/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        double sal, salF;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o salário");
        sal = e.nextDouble();
        if (sal <= 350){sal= sal+100; salF= sal-(sal*0.07);}
        else {if (sal<=600){sal= sal+75; salF= sal-(sal*0.07);}
        else if (sal <= 900) {sal= sal+50; salF= sal-(sal*0.07);}
        else {sal= sal+35; salF= sal-(sal*0.07);}
        }
        System.out.println("O novo salário é: R$"+salF);
    }
}

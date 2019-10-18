/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        double sal, salF;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o salário");
        sal = e.nextDouble();
        if (sal <= 300){salF = sal + (sal*0.15);}
        else {if (sal<=600){salF=sal+(sal*0.1);}
        else if (sal <= 900) {salF= sal+(sal*0.05);}
        else {salF = sal;}
        }
        System.out.println("O novo salário é: R$"+salF);
    }
}

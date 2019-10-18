/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestoesCap04;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
          double sal, salF;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o salário");
        sal = e.nextDouble();
        if (sal <= 300){salF = sal + (sal*0.5);}
        else {if (sal<=500){salF=sal+(sal*0.4);}
        else if (sal <= 700) {salF= sal+(sal*0.3);}
        else {if (sal<=800){salF=sal+(sal*0.2);}
        else if (sal <= 1000) {salF= sal+(sal*0.1);}
        else{salF= sal+(sal*0.05);}}
        }
        System.out.println("O novo salário é: R$"+salF);
    }
}

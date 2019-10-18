package QuestoesCap04;

import java.util.Scanner;


public class q22 {
    

    public static void main(String[] args) {
        int idade;
        double peso;       
        Scanner e= new Scanner(System.in);
        System.out.println("Informe a sua idade");
        idade= e.nextInt();
        System.out.println("Informe o seu peso");
        peso= e.nextDouble();
        if (idade <20) {
            if (peso <60){
                System.out.println("Situação de risco: 9");
            } else if (peso <=90){
                System.out.println("Situação de risco: 8");
            } else {                System.out.println("Situação de risco: 7");}
        } else if (idade <=50) { if (peso <60){
                System.out.println("Situação de risco: 6");
            } else if (peso <=90){
                System.out.println("Situação de risco: 5");
            } else {                System.out.println("Situação de risco: 4");}
        } else {
         if (peso <60){
                System.out.println("Situação de risco: 3");
            } else if (peso <=90){
                System.out.println("Situação de risco: 2");
            } else {                System.out.println("Situação de risco: 1");}
        }
    }
                 
    
}
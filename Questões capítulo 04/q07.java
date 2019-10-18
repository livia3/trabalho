package QuestoesCap04;

import java.util.Scanner;

   public class q07 {
    public static void main(String[] args) {
        double sal, result, aument;
         double porc = 30;
             Scanner e = new Scanner(System.in);
    //entrada
   
    System.out.print("SEU SALARIO:");
    sal = e.nextDouble();
    //processamento
    aument = ((sal*porc)/100)+sal;
    // saida
    if (sal <= 500)
     System.out.print("REAJUSTE: R$"+aument);
     else
    System.out.println("PERDÃO, VOCÊ NÃO TEM DIREITO AO AuMENTO.");

    }}



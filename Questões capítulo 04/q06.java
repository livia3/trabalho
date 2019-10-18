
package QuestoesCap04;

import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
           
     double n1, n2, poten, raiz1, raiz2, raizcub1, raizcub2, subt;
     int escolha;
   Scanner e = new Scanner(System.in);

   //entrada
   System.out.print("1º Numero");
    n1 = e.nextDouble();
   System.out.print("2º Numero");
    n2 = e.nextDouble();
   System.out.println("O QUE DESEJA FAZER:");
   System.out.println("1 : O Primeiro elevado ao segundo.");
   System.out.println("2 : Raiz quadrada de cada numero.");
   System.out.println("3 : Raiz cubica de cada numero:");
   escolha = e.nextInt();
    //processamento
poten = Math.pow(n1, n2);
raiz1 = Math.sqrt(n1);
raiz2 = Math.sqrt(n2);
raizcub1 = Math.cbrt(n1);
raizcub2 = Math.cbrt(n2);
//saida
switch (escolha){                                
    case 1: 
      System.out.println("O Primeiro elevado ao segundo: "+poten);
      break;
        case 2: 
      System.out.println("Raiz quadrada de cada numero respectivamente\n " +raiz1+"  "+raiz2);
      break;
         case 3: 
      System.out.println("Raiz Cubica de cada numero respectivamnete\n" +raizcub1+"  " + raizcub2);
      break;
default: System.out.println(" PERDÃO, O NUMERO DIGITADO NÃO CORRESPONDE A NENHUMA AÇÃO!");
}
}
}
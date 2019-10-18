package QuestoesCap3;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        //variaveis
        int tabn;
        int ct;
        int n; 
        Scanner e = new Scanner(System.in);
        //entrada
        System.out.println("Você quer a tabuada de qual numero?");
        tabn = e.nextInt();
        //processamento
        for (ct=1; ct<11; ct++ ) {
            n = ct;
        //saida
            System.out.println(tabn+"x"+ct+"="+(tabn*ct));
        }
        
    }
    
}

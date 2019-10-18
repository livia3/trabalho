package QuestoesCap04;

import java.util.Scanner;

public class q24 {

    public static void main(String[] args) {
        double preco, npreco = 0, newSalImp;
        int categoria;
        Scanner e = new Scanner(System.in);
        String situacao;
        System.out.println("Preço do Produto:");
        preco = e.nextDouble();
        System.out.println("Categoria:");
        System.out.println("1 - Limpeza:");
        System.out.println("2 - Alimentação:");
        System.out.println("3 - Vestuario:");
        categoria = e.nextInt();
        System.out.println("Situacao: Nescessita de Refrigeração [S/N]");
        situacao = e.next();
        //Processamento
        if (preco <= 25) {
            switch (categoria) {
                case 1:
                    npreco = ((preco * 5) / 100) + preco;
                    break;
                case 2:
                    npreco = ((preco * 8) / 100) + preco;
                    break;
                case 3:
                    npreco = ((preco * 10) / 100) + preco;
                    break;
            }
        } else {
            switch (categoria) {
                case 1:
                    npreco = ((preco * 12) / 100) + preco;
                    break;
                case 2:
                    npreco = ((preco * 15) / 100) + preco;
                    break;
                case 3:
                    npreco = ((preco * 18) / 100) + preco;
                    break;
            }
        }
        
        if ( situacao.equals('s') | categoria == 2){
            
            newSalImp = (((preco * 5) / 100) + npreco);
            System.out.println("Preço Final: R$"+newSalImp);
        } else {
            newSalImp = (((preco * 8) / 100) + npreco);
                        System.out.println("Preço Final: R$"+newSalImp);

  }
    }
}

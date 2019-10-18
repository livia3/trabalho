package QuestoesCap04;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        double preco, custoF;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o preço de fábrica");
        custoF = e.nextDouble();
        if (12000 >= custoF) {preco = custoF + (custoF*0.05);}
        else if (custoF <= 25000){preco = custoF + (custoF*0.1)+(custoF*0.15);}
        else {preco = custoF + (custoF*0.15)+(custoF*0.2);}
        System.out.println("O preço do carro é:"+preco);
    }
}

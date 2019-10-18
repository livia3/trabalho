
package QuestoesCap3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questão20 {
    public static void main(String[] args) {

        double ang,dis,ce;
        Scanner e = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##");
        System.out.println("Informe o ângulo formado pela escada: ");
        ang = e.nextDouble();
        System.out.println("Informe a distância da escada para a parede: ");
        dis = e.nextDouble();
        ce = dis * Math.cos(Math.toRadians(ang));
        System.out.println("O comprimento da escada é de "+df.format(ce)+"m");
    }
}

 








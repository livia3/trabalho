package questões.capítulo.pkg05;

import java.util.Scanner;

public class q14 {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int i, io = 0, op, qb = 0, qo = 0, qnt = 0, r = 0, x;
        double med, porc;
        for (x = 1; x <= 15; x++) {
            System.out.println("Informe a idade");
            i = e.nextInt();
            System.out.println("Informe a opinião (1= regular,2=bom,3=ótimo");
            op = e.nextInt();
            switch (op) {
                case 3:
                    io += i;
                    qo++;
                    break;
                case 1:
                    r++;
                    break;
                case 2:
                    qb++;
                    break;
                default:
                    break;
            }
            qnt++;
        }
        med = io / (1.0 * qo);
        porc = qb * 100 / (qnt * 1.0);
        System.out.println("A média das idades de quem respondeu ótimo é: " + med);
        System.out.println("A quantidade de pessoas que responderam regular é: " + r);
        System.out.println("A porcentagem de quem respondeu bom é: " + porc + "%");
    }
}

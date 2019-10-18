package questões.capítulo.pkg05;

import java.util.Scanner;

public class q15e {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        String sex, res;
        int x, qs = 0, qn = 0, ms = 0, hs = 0, hn = 0;
        double r, ht;
        for (x = 1; x <= 5; x++) {
            System.out.println("Informe o sexo(M ou F)");
            sex = e.next();
            System.out.println("Informe sua resposta (S ou N)");
            res = e.next();
            if (res.equals("S")) {
                qs++;
            } else if (res.equals("N")) {
                qn++;
            }
            if (sex.equals("F") && res.equals("S")) {
                ms++;
            } else if (res.equals("S") && sex.equals("M")) {
                hs++;
            } else if (res.equals("N") && sex.equals("M")) {
                hn++;
            }
        }
        ht = hn + hs;
        r = (hn * 100) / ht;
        System.out.println("Pessoas que responderam sim: " + qs);
        System.out.println("Pessoas que responderam não: " + qn);
        System.out.println("mulheres que responderam sim: " + ms);
        System.out.println("porcentagem de homens que responderam não: " + r);
    }
}

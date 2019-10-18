package QuestoesCap04;

import java.util.Scanner;


public class q09 {
    public static void main(String[] args) {
        double saldoM ,credito;
        Scanner e = new Scanner (System.in);
        System.out.println("Informe o saldo médio");
        saldoM = e.nextDouble();
        if (saldoM < 200){credito = saldoM * 0.1;}
        else if (saldoM <300) {credito = saldoM * 0.2;}
        else {if (saldoM <= 400) {credito = saldoM * 0.25;}
        else {credito = saldoM*0.3;}}
        System.out.println("seu saldo médio é: "+saldoM+". O seu créito é: "+credito);
        
    }
    
}

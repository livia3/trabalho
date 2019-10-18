
package QuestoesCap3;

import java.util.Scanner;

public class Questão25 {
    public static void main(String[] args) {
        //variaveis
        int hr_min, tot_min, tot_seg;
        int hora,min,seg;
        Scanner e = new Scanner(System.in);
        //entrada
        System.out.println("Informe a Hora/Min:");
        System.out.print("Hora:"); hora= e.nextInt();
        System.out.print("Minutos:"); min= e.nextInt();
        //processamneto
        hr_min = hora*60;
        tot_min = hr_min + min;
        tot_seg = tot_min*60;
        //saida
        System.out.println("Hora convertida em minutos:"+hr_min);
        System.out.println("Total de Minutos:"+tot_min);
        System.out.println("Total de Segundos:"+tot_seg);
        
    }
}

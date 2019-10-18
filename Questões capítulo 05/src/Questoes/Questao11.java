package cap05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class questao11 {

    public static void main(String[] args) {
        double carro, y;
        int x;
       String sn  ;
               DecimalFormat  df = new DecimalFormat ("0.000");
               do{
                   
               
        carro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro: "));
        x = Integer.parseInt(JOptionPane.showInputDialog("Escolha em quantas vezes o senhor deseja parcela o carro:\n1 - 6x mas tera 3% de acréscimo\n2 - 12x mas tera 6% de acréscimo\n3 - 18x mas tera 9% de acréscimo"
                + "\n4 - 24x mas tera 12% de acréscimo\n5 - 30x mas tera 15% de acréscimo\n6 - 36x mas tera 18% de acréscimo\n7 - 42x mas tera 21% de acréscimo\n8 - 48x mas tera 24% de acréscimo"
                + "\n9 - 54x mas tera 27% de acréscimo\n10 - 60x mas tera 30% de acréscimo\n11 - A vista"));
            
        
        switch (x) {
            case 1:
                y = (carro + (carro * 3 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 6));
                break;
            case 2:
                y = (carro + (carro * 6 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 12));
                break;
            case 3:
                y = (carro + (carro * 9 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 18));
                break;
            case 4:
                y = (carro + (carro * 12 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 24));
                break;
            case 5:
                y = (carro + (carro * 15 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " +df.format(y / 30));
                break;
            case 6:
                y = (carro + (carro * 18 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " +df.format(y / 36));
                break;
            case 7:
                y = (carro + (carro * 21 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 42));
                break;
            case 8:
                y = (carro + (carro * 24 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 48));
                break;
            case 9:
                y = (carro + (carro * 27 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " +df.format(y / 54));
                break;
            case 10:
                y = (carro + (carro * 30 / 100));
                JOptionPane.showMessageDialog(null, "O valor final com acréscimo será: " + y + " e você tera que pagar: " + df.format(y / 60));
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "O preço final a vista tem desconto de 20%, e ele saira por: " + df.format(carro - (carro * 20 / 100)) + " R$");
                
        }
                sn = JOptionPane.showInputDialog("O senhor repetir [S/N]: ");
        }while(sn.equals("S"));
    }
}

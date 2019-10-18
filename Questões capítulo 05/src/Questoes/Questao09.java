package cap05;

import javax.swing.JOptionPane;

public class questao09 {

    public static void main(String[] args) {
        double idade, peso, altura, somida = 0, media;
        int c = 0, alt = 0, ida = 0;
        while (c != 3) {            
            idade = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
            if (peso > 90 && altura < 1.50) {
                alt++;
            }
            somida += idade;
            ida++;
            c++;
        }
        media = somida/ida;
        JOptionPane.showMessageDialog(null, "A media das idades é: "+media);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1.50 são: "+alt+ " pessoas");
        
    }
}

package cap05;

import javax.swing.JOptionPane;

public class questao08 {

    public static void main(String[] args) {
        /* olhos : A - azul ; p - preto ; V verde ; C - castanho;
        Cabelos : C - castanho ; P - preto ; R - ruivo ; L - loiro;
         */
        double idade, peso, altura, somida = 0, media;
        String olhos, cabelos;
        double ida = 0, alt = 0, cor = 0, olhoA = 0;
        int c = 0;
        while (c != 6) {
            idade = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
            olhos = JOptionPane.showInputDialog("Informe a cor de seus olhos\n Olhos :\n A - azul\n P - preto\n V - verde\n C = castanho ");
            cabelos = JOptionPane.showInputDialog("Informe a cor de seus cabelos\n Cabelos :\n R - ruivo\n P - preto\n L - loiro\n C = castanho ");
            if (idade > 50 && peso < 60) {
                ida++;
            }

            if (altura == 1.50) {
                alt++;
                somida += idade;
            }

            if (cabelos.equals("R") && !olhos.equals("A")) {
                cor++;
            }
            if (olhos.equals("A")) {
                olhoA++;
            }
            c++;
        }
        media = somida / alt;
        JOptionPane.showMessageDialog(null, "A porcentagem de pessoas com olhos azul é: "+(olhoA*100/6)+" %");
        JOptionPane.showMessageDialog(null, "A quantidades de pessoas com peso inferior a 60 e idade maior que 50 são: "+ida);
        JOptionPane.showMessageDialog(null, "a media das pessoas com altura inferior a 1.50 é: "+media);
        JOptionPane.showMessageDialog(null, "a quantidade de pessoas com cabelos ruivos e olhos não azul é: "+cor);
    }
}

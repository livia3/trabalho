package capitulo05;

import javax.swing.JOptionPane;

public class quest22 {

    public static void main(String[] args) {
        int idade = 1, cont = 0;
        double media, altura, somaAlt = 0;

        while (idade > 0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
            if (idade >= 50) {
                somaAlt = somaAlt + altura;
                cont = (cont + 1);
            } }
        media = somaAlt / cont;
        JOptionPane.showMessageDialog(null, "MÉDIA DA ALTURA DAS PESSOAS COM MAIS DE 50 ANOS: " + media);

    }

}

package questões.capítulo.pkg05;

import javax.swing.JOptionPane;

public class q18 {

    public static void main(String[] args) {
        String sexo, menorsalsexo = "0";
        int idade = 1, conth = 0, contf200 = 0, maior = 0, menor = 9999, menorsalidade = 0;
        double salario, Msalario = 0, menorsalario = 99999;
        while (idade >= 0) {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do entrevistado: "));
            if (idade >= 0) {
                sexo = (JOptionPane.showInputDialog("Sexo<M/F>: "));
                salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário: "));

                if (salario >= 0) {

                    Msalario += salario;
                    conth++;
                }
                if (idade > maior) {
                    maior = idade;
                }
                if (idade < menor) {
                    menor = idade;

                }
                if (salario <= 200 && sexo.equals("F")) {
                    contf200++;
                }
                if (salario < menorsalario) {
                    menorsalario = salario;
                    menorsalidade = idade;
                    menorsalsexo = sexo;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Idade inválida");
            }

        }

        JOptionPane.showMessageDialog(null, "Media dos salarios do grupo: R$" + (Msalario / conth));
        JOptionPane.showMessageDialog(null, "Menor idade: " + menor + " anos");
        JOptionPane.showMessageDialog(null, "Maior idade: " + maior + " anos");
        JOptionPane.showMessageDialog(null, "A quantidade de mulheres com salário até R$ 200,00 foi de: " + contf200);
        JOptionPane.showMessageDialog(null, "a pessoa que possui o menor salário de R$" + menorsalario + " tem idade " + menorsalidade + " anos do sexo " + menorsalsexo);
    }
}

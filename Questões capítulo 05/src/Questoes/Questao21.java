package capitulo05;

import javax.swing.JOptionPane;

public class ques21 {

    public static void main(String[] args) {
        String cd1, cd2, cd3, cd4;
        int voto, cont = 1, total = 0;
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, branco = 0, nulo = 0;
        double percentualNulo, valorFinalNulo, percentualBranco, valorFinalBranco;
        JOptionPane.showMessageDialog(null, "REGISTRAR CANDIDATOS");
        cd1 = JOptionPane.showInputDialog(null, "CANDIDATO 1:");
        cd2 = JOptionPane.showInputDialog(null, "CANDIDATO 2:");
        cd3 = JOptionPane.showInputDialog(null, "CANDIDATO 3:");
        cd4 = JOptionPane.showInputDialog(null, "CANDIDATO 4:");
        while (cont != 0) {
            JOptionPane.showMessageDialog(null, "SUAS OPÇÕES DE VOTO:\n"
                    + "1 - " + cd1 + "\n"
                    + "2 - " + cd2 + "\n"
                    + "3 - " + cd3 + "\n"
                    + "4 - " + cd4 + "\n"
                    + "5 - Nulo \n"
                    + "6 - Em branco \n"
                    + "0 - Encerrar \n");
            voto = Integer.parseInt(JOptionPane.showInputDialog(null, "SEU VOTO:"));
            if (voto != 0) {
                total = total + 1;
                switch (voto) {
                    case 1:
                        cand1 = cand1 + 1 ;
                        break;
                    case 2:
                        cand2 = cand2 + 1;
                        break;
                    case 3:
                        cand3 = cand3 + 1;
                        break;
                    case 4:
                        cand4 = cand4 + 1;
                        break;
                    case 5:
                        nulo = nulo + 1;
                        break;
                    case 6:
                        branco = branco + 1;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "VOTO INVALIDO!");
                }
            } else {
                JOptionPane.showMessageDialog(null, " A SEÇÃO FOI ENCERRADA!\n" + "OS VOTOS SERÃO COMPUTADOS.\n");
                cont = 0;
            }
        }

        percentualNulo = nulo / 100.0;
        valorFinalNulo = total + (percentualNulo * total);

        percentualBranco = branco / 100.0;
        valorFinalBranco = total + (percentualBranco * total);

        JOptionPane.showMessageDialog(null, "VOTOS PARA CADA CANDIDATO:\n"
                + cd1 + "- " + cand1 + "\n"
                + cd2 + "- " + cand2 + "\n"
                + cd3 + "- " + cand3 + "\n"
                + cd4 + "- " + cand4 + "\n");
        JOptionPane.showMessageDialog(null, "DADOS ADICIONAIS:\n"
                + "TOTAL: " + total + "\n"
                + "Nulos: " + nulo + " Votos | " + valorFinalNulo + "% \n"
                + "Em Branco: " + branco + " Votos | " + valorFinalBranco + "% \n"
        );

    }
}

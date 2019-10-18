
package questões.capítulo.pkg05;

import javax.swing.JOptionPane;


public class q16 {
    public static void main(String[] args) {
        
    int i = 1,qnt = 0;double ids = 0,res;
    while(i>0){
        i=Integer.parseInt(JOptionPane.showInputDialog("Informe a idade \n"));
        if (i>0){
        qnt++;ids += i;
        } else {JOptionPane.showMessageDialog(null,"Número Invalido! \n");}
    }
    res = ids/qnt;
    JOptionPane.showMessageDialog(null, "A média de idades é: "+res);
}
}
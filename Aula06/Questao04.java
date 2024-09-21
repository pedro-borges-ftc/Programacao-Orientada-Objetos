package Aula06;

import javax.swing.JOptionPane;

public class Questao04 {
    public static void main(String[] args) {
        int n,c,r,s;

        n = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite um valor inteiro: ")));

        r = 0;
        s = -1;

        for(c = 1; c<= n; c++){
            if(c % 2 == 0){
                r = r + c * s;
            }else{
                r = r + c;
            }
        }
        JOptionPane.showMessageDialog(null, r);
    }
}

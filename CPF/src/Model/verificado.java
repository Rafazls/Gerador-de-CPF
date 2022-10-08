package Model;

import javax.swing.JOptionPane;

public class verificado {

    public static int valores;
    public static int[] n = new int[11];
    public static int pen, ult;
    public static int result, rest;

    public static void prim() {
        for (int i = 0; i < 11; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os  números do ceu cpf:"));

        }

        valores = n[0] * 2 + n[1] * 3 + n[2] * 4 + n[3] * 5 + n[4] * 6 + n[5] * 7 + n[6] * 8 + n[7] * 9 + n[8] * 10;
        result = valores / 11;
        rest = valores % 11;

        if (rest < 2) {
            
            pen = 0;

        } else {

            pen = 11 - rest;
        }

    }
    
    public static void seg(){
    
        valores = pen*2+ n[0] * 3 + n[1] * 4 + n[2] * 5 + n[3] * 6 + n[4] * 7 + n[5] * 8 + n[6] * 9 + n[7] * 10 + n[8] * 11;
        result = valores / 11;
        rest = valores % 11;

        if (rest < 2) {
            ult = 0;

        } else {

            ult = 11 - rest;
        }
    }
    
public static void resultado(){

    if(n[9]==ult && n[10]==pen){
        JOptionPane.showMessageDialog(null,"CPF Válido");
 JOptionPane.showMessageDialog(null,ult+""+pen);
    }else{
    
        JOptionPane.showMessageDialog(null,"CPF INVÁLIDO");
    
    
    }
}
 
}
   
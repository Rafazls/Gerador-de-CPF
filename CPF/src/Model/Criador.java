package Model;


import java.util.Random;
import javax.swing.JOptionPane;

public class Criador {
     public static int valores;
    public static int[] n = new int[11];
    public static int pen, ult;
    public static int result, rest;

    public static void criar1() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {

            n[i] = random.nextInt(9);

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
    
   public static void criar2(){
    
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

 JOptionPane.showMessageDialog(null,n[0]+""+ n[1]+""+n[2]+""+ n[3]+""+ n[4]+""+ n[5]+""+ n[6]+""+ n[7]+""+ n[8]+""+pen+""+ult);
 
}   
    
}

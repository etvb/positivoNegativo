/*
 *Ejercicio2:Leer un número e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0.
 */
package pats.pkg30.pkg2.positivonegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS302PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        
        while(numero != 0){
            if(numero >=1){
                JOptionPane.showMessageDialog(null, numero +" es POSITIVO");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro valor"));
            }else{
                JOptionPane.showMessageDialog(null, numero +" es NEGATIVO"); 
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro valor"));
            }
        }
    }
    
}

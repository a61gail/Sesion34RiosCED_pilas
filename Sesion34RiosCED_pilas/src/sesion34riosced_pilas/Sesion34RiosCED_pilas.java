package sesion34riosced_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Abigail
 */
public class Sesion34RiosCED_pilas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de pila
        Stack<Integer> pilaRios = new Stack<>();
        pilaRios.push(100);
        pilaRios.push(150);
        pilaRios.push(230);
        pilaRios.push(10);
        pilaRios.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n" + pilaRios);
        
        JOptionPane.showMessageDialog(null, "Autor Abigail Ríos \n");
        
    }
    
}

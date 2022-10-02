
package proyect;

import java.util.Scanner;

import tienda.Tienda;

public class Proyect {

  
    public static void main(String[] args) {
        String nombreT;
        String nombreD;
        Scanner cap = new Scanner(System.in);
        System.out.println("BIENBENIDO QUERIODO USUARIO ");
        
        System.out.print("DIGITE EL NOMBRE DE LA TIENDA ");nombreT=cap.nextLine();
        System.out.print("DIGITE EL NOMBRE DEL DUEÑO DE LA TIENDA ");nombreD=cap.nextLine();
        
        Tienda a=new Tienda(nombreT, nombreD);
        a.cre_pro();
        System.out.println(a.toString());
        
        
    }
    
}


package tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tienda {
    private String nombreT;
    private String nombreD;
    
    private List <Productos> ventas; 
    private Scanner cap = new Scanner(System.in);

    public Tienda() {
        nombreD=null;
        nombreT=null;
    }
    
    
    public Tienda(String nombreT, String nombreD) {
        this.nombreT = nombreT;
        this.nombreD = nombreD;
    }
    
    
    public void cre_pro(){
        char R='S';
        String nombre;
        double cantidad=0;
        double invercion=0;
        double precio_vender=0;
        
        List<Productos> lista=new ArrayList<Productos>();
        
        while(R=='S'){
            System.out.print("\n\n\nDIGITA EL NOMBRE DEL PRODUCTO : ");
            nombre=cap.nextLine();
            System.out.print("\n\nDIGITE EL NUMERO DE ELEMENTOS QUE COMPRO : ");
            cantidad=cap.nextDouble();
            System.out.print("\n\nDIGITE LA INVERCION DE DICHO PRODUCTO : ");
            invercion=cap.nextDouble();
            System.out.print("\n\nDIGITE EL PRECIO A VENDER : ");
            precio_vender=cap.nextDouble();
            
            
            Productos auxi=new Productos(nombre, cantidad, invercion, precio_vender);
            auxi.C_ganacia();
            do{
                System.out.print("\n\nDESEA DIGITAR OTRO PRODUCTO S/N ");R=cap.next().charAt(0);
                R=Character.toUpperCase(R);
            }while(R!='S' && R!='N');
            lista.add(auxi);
            cap.nextLine();
        }
        ventas=lista;
    }

    @Override
    public String toString() {
        return "\nDATOS DE LA TIENDA. "
                + "\nNOMBRE DE LA TIENDA : " + nombreT 
                + "\nNOMBRE DEL DUEÑO : " + nombreD 
                + "\n\n" + ventas + '\n';
    }
    
    
    
    
}

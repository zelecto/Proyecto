
package tienda;


public class Productos {
    private String nombre;
    private double cantidad;
    private double invercion;
    private double precio_vender;
    private double ganancia;
    private double perdida;
    

    public Productos() {
        nombre=null;
        cantidad=0;
        invercion=0;
        precio_vender=0;
    }

    public Productos(String nombre, double cantidad, double invercion, double precio_vender) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.invercion = invercion;
        this.precio_vender = precio_vender;
    }

    
    
    public void C_ganacia(){
        double a;
        a= cantidad*precio_vender;
        ganancia=a-invercion;
        if(ganancia<0){
            perdida=ganancia;
            ganancia=0;
        }
        
    }

    @Override
    public String toString() {
        return "----------------------------------------------------------------"
                +"\nDATOS DEL PRODUCTO" + 
                "\nNOMBRE : " + nombre 
                + "\nCANTIDAD : " + cantidad 
                + "\nINVERCION : " + invercion 
                + "\nPRECIA A VENDIDO : " + precio_vender 
                + "\nLAS GANACIAS SON : " + ganancia 
                + "\nLAS PERDIDAS SON : " + perdida 
                + "\n----------------------------------------------------------------\n\n\n";
    }
    
    
    
    
    
}

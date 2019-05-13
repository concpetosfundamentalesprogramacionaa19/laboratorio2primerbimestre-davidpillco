/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportespadresdefamilia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ReportesPadresdefamilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        // Declaración de variables
        
        
        String nombre;
        double sueldo;
        int nhijos;
        double pasajes;
        double bar;
        double salidas;
        String mensajeFinal = "";
        int contador = 1;
        double totalpasajes = 0;
        double totalbar = 0;
        double totalsalidas = 0;
        double etotal;
        boolean bandera = true;
        String opcion ="";
        while(bandera == true){
            System.out.print ("Ingrese sus nombres y apellidos: ");
            nombre = entrada.nextLine();
            System.out.print ("Ingrese su sueldo semanal: ");
            sueldo = entrada.nextDouble();
            System.out.print ("Ingrese el numero de hijos: ");
            nhijos = entrada.nextInt();
            mensajeFinal = String.format ("Reporte \nNombre de Padre de Familia:%s\n"
                    +"Sueldo semanal %.1f\nNumero de Hijos: %d\n\nPersona    Pasaje        Bar        Salidas\n ",nombre,sueldo,nhijos);    
            while(contador <= nhijos){
                System.out.print ("Ingrese el dinero destinado a los pasajes de su hijo: ");
                pasajes = entrada.nextDouble();
            
                System.out.print ("Ingrese el dinero destinado al bar su hijo: ");
                bar = entrada.nextDouble();
            
                System.out.print ("Ingrese el dinero destinado para las salidas de su hijo: ");
                salidas = entrada.nextDouble();
            
                mensajeFinal = String.format("%sHijo %s      %.1f         %.1f          %.1f\n",
                mensajeFinal,contador,pasajes, bar, salidas);
                totalpasajes = totalpasajes + pasajes;
                totalbar = totalbar + bar;
                totalsalidas = totalsalidas + salidas;
                contador = contador +1; // que el contador se incremente
                mensajeFinal = String.format("%s Total       %.1f         %.1f          %.1f",mensajeFinal,totalpasajes,totalbar,totalsalidas);
        
                System.out.println("Digite 's' si desea ingresar datos para otro reporte y 'n' si no desea");
                opcion = entrada.nextLine();
                entrada.nextLine(); //Lipiando buffer
            if(opcion.equals("s")){
                bandera = true;
            }else{
                bandera = false;   
            } 
            etotal = totalpasajes + totalbar + totalsalidas;
            if (etotal > sueldo) { 
                System.out.printf("%s\nEl padre de familia %s le falta el dinero semanal,para sus gastos\n ", mensajeFinal,nombre);    
            }else{
                System.out.printf("%s\nEl padre de familia %s le alcanza el dinero semanal,para sus gastos\n ", mensajeFinal,nombre);    
            }  

      
        }    
    }
    }
}

    
    


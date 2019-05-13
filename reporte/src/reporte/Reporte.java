/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Reporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double sueldo = 0;
        int nhijos = 0;
        double pasajes = 0;
        double bar = 0;
        double salidas = 0;
        String mensajeFinal = "";
        int contador = 1;
        int contador2 = 1;
        double totalpasajes = 0;
        double totalbar = 0;
        double totalsalidas = 0;
        double etotal = 0;
        boolean bandera = true;
        String opcion = "";
mensajeFinal = String.format("%s%s\n\n",mensajeFinal,
                "Reporte Gastos de los Padres de Familia");
while(bandera == true){
    // Se ingresaran los datos
    System.out.print ("Ingrese sus nombres y apellidos: ");
    nombre = entrada.nextLine();
    System.out.print ("Ingrese su sueldo semanal: ");
    sueldo = entrada.nextDouble();
    System.out.print ("Ingrese el numero de hijos: ");
    nhijos = entrada.nextInt();
    //Imprimir primera cadena
    mensajeFinal = String.format("%sReporte%d: \n",mensajeFinal,contador);
    contador = contador +1;
    mensajeFinal = String.format("%sNombre del Padre de Familia :  "
                + "%s\nSueldo semanal : %.2f\nNúmero de Hijos: "
                + "%d\n\nReporte de"
                + " Gastos\nPersona      Pasaje      Bar      Salidas\n"
                ,mensajeFinal,nombre,sueldo,nhijos);
    //Segunda condicion
    while(contador2 <= nhijos){
        
    // Se ingresa los  datos de los hijos
    
    System.out.printf("Hijo %d\n",contador2);
    System.out.print ("Ingrese el dinero destinado a los pasajes de su hijo: ");
    pasajes = entrada.nextDouble();
    System.out.print ("Ingrese el dinero destinado al bar su hijo: ");
    bar = entrada.nextDouble();
    System.out.print ("Ingrese el dinero destinado para las salidas de su "
            + "hijo: ");
    salidas = entrada.nextDouble();
    mensajeFinal = String.format("%sHijo %d      %.2f         %.2f     "
            + "     %.2f\n",
    mensajeFinal,contador2,pasajes, bar, salidas);
    contador2 = contador2 + 1;
    
    //Se suman los totales
    totalpasajes = totalpasajes + pasajes;
    totalbar = totalbar + bar;
    totalsalidas = totalsalidas + salidas;
    etotal = totalpasajes + totalbar + totalsalidas;
    }
    mensajeFinal = String.format("%s Total       %.2f         %.2f        "
            + "  %.2f\n",mensajeFinal,totalpasajes,totalbar,totalsalidas);
    
    //Resultado
    if (etotal < sueldo) { 
    System.out.printf("%s\nEl padre de familia %s le alcanza el dinero"
            + " semanal,para sus gastos.\n ", mensajeFinal,nombre);    
    }else{
    System.out.printf("%s\nEl padre de familia %s le falta el dinero "
            + "semanal,para sus gastos.\n ", mensajeFinal,nombre);        
    }
    entrada.nextLine();
    
    //Se pregunta si se desea realizar mas reportes
    System.out.println("Ingrese 's' para realizar otro reporte o 'n'"
            + " para finalizar");
    opcion = entrada.nextLine();
    if (opcion.equals("s")) {
        bandera = true;
        contador2 = 1;
    }else{
        bandera = false;
    }
mensajeFinal = String.format("%s\n Fin reporte %d",mensajeFinal,contador-1);
}        
 //Presentar el resultado       
    System.out.printf("%s",mensajeFinal);
        
                  
            
    }
        
}
    


    
    


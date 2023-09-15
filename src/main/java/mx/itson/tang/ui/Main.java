  
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 *Inicia el programa y determina el punto de partida de su ejecución
 * @author Agustin Rodríguez
 */
public class Main {
    
    public static void main(String [] args){
        /*
        System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        String nuevaOracion =oracion.replace("n", "x");
        System.out.println(nuevaOracion);
        */
        
        
       /* boolean resultado = oracion.startsWith("a");
        if(resultado){
            System.out.println("si incia con a");
        }else{
            System.out.println("no inicia con a");
        }
        
        ///////////////////////
        if (oracion.startsWith("a")){
         System.out.println("si incia con a");
        }else{
            System.out.println("no inicia con a");
        }
        
        ///////////////////////
        System.out.println(oracion.startsWith("a")?"si inicia con a" : "no inicia con a");
        */
        
        System.out.println("Ingrese los numeros");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        int Tijuana = 0;
        int Hermosillo =0;
        int Guaymas = 0;
        int Desconocido = 0;
        
        String cel = oracion.replace("-", "").replace(")", "").replace("(", "").replace(" ", "");     
        System.out.println(cel);
        
        String [] telefono = cel.split(",");
        for (String t : telefono){
            System.out.println(t);
        if (t.startsWith("664")){
             Tijuana++;
        }
        }
        for (String g : telefono){
            System.out.println(g);
            if(g.startsWith("622"))
                Guaymas++;
        }
        for (String h : telefono){
            System.out.println(h);
            if(h.startsWith("662"))
                Hermosillo++;
            
        }
        for (String d : telefono){
            System.out.println(d);
            if (d.startsWith("66"))
                Desconocido++;
             }
        
            System.out.println("hay:"+Tijuana +"numeros de Tijuana");
            System.out.println("hay:"+Guaymas +"numeros de Guaymas");
            System.out.println("hay:"+Hermosillo+"numero de Hermosillo");
            System.out.println("hay:"+Desconocido +"numeros Desconocidos");
        
        
        }
    }
     
       


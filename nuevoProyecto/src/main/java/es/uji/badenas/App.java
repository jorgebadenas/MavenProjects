package es.uji.badenas;

import java.util.Scanner;

import javax.swing.JOptionPane;

import es.uji.www.GeneradorDatosINE;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int resultado = (int) Math.round(Math.sqrt(9.9));
    	resultado = (int) Math.pow(resultado, 6);
        String cadena = "El resutado es " + resultado + "obtenido a apartir del n�mero " + 9.9;
        String subcadena = cadena.substring(3, cadena.length()-1);
        System.out.println(subcadena);
        
        GeneradorDatosINE generador = new  GeneradorDatosINE();
        String nombre = generador.getNombre();
        System.out.println("El nombe es:" + nombre);
        
        //String s = JOptionPane.showInputDialog("P�same un mensaje");
        //System.out.println(s);
        
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadenaleida = entrada.nextLine();
        System.out.println("cadena le�da " + cadenaleida);
        
        System.out.print("Introduce la edad: ");
        String edadString = entrada.nextLine();
        int edad = Integer.parseInt(edadString);
        
        System.out.print("Introduce un real: ");
        String realString = entrada.nextLine();
        double real = Double.parseDouble(realString);
        
                //int edad = entrada.nextInt();
        System.out.println("La edad es: " + edad);
        
        //System.out.print("Introduce un real: ");
        //double real = entrada.nextDouble();
        System.out.printf("El real es: %.2f", real);
        
        System.out.println("Introduce una cadena");
        cadenaleida = entrada.nextLine();
        System.out.println("cadena le�da " + cadenaleida);*/
    }
}

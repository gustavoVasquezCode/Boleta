import java.io.*;
import java.util.Scanner;

public class Boleta {
    public static void main(String[ ] args) throws IOException {

        Alumno obj1 = new Alumno( );

        Scanner leer = new Scanner(System.in);

        String noControl;
        String nombre;
        int numeroDeCalificaciones;


        System.out.print("Ingrese el numero de control: ");
        noControl = leer.nextLine( );

        System.out.print("Ingrese el nombre: ");
        nombre = leer.nextLine( );

        System.out.print("Ingrese el numero de calificaciones: ");
        numeroDeCalificaciones = leer.nextInt( );

        obj1.setNoControl(noControl);
        obj1.setNombre(nombre);
        obj1.setNumeroDeCalificaciones(numeroDeCalificaciones);
        obj1.calcularPromedio( );

        System.out.println("\n*******************************************");
        System.out.println("\t BOLETA DEL ALUMNO");
        System.out.println("*******************************************");
        System.out.println("Numero de Control: " + obj1.getNoControl( ));
        System.out.println("Nombre: " + obj1.getNombre( ));
        System.out.println("Promedio: " + obj1.getPromedio( ));

    }
}

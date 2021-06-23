import java.io.*;

public class Alumno {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String noControl;
    private String nombre;
    private int numeroDeCalificaciones;
    private float promedio;
    private float calificacion;
    private int i;
    private float sumaCalificaiones;

    public Alumno( ){
        noControl = "Sin Asignar";
        nombre = "Sin dato";
        numeroDeCalificaciones = 0;
        promedio = 0;
        calificacion = 0;
    }

    public void calcularPromedio( ) throws IOException{
        validarCalificacion( );
        promedio = sumaCalificaiones/numeroDeCalificaciones;
    }

    private void validarCalificacion( ) throws IOException{
        i=1;
        sumaCalificaiones = 0;
        while(i<=numeroDeCalificaciones){
            leerCalificaciones( );
            if(calificacion <= 69){
                sumaCalificaiones = 0;
                break;
            }
            else{
                sumaCalificaiones += calificacion;
            }
            i++;
        }
    }

    private void leerCalificaciones( ) throws IOException{
        System.out.print("Ingrese la calificacion [" + i + "]: ");
        calificacion = Float.parseFloat(reader.readLine( ));
    }

    public void setNumeroDeCalificaciones(int numeroDeCalificaciones){
        this.numeroDeCalificaciones = numeroDeCalificaciones;
    }

    public void setNoControl(String noControl){ this.noControl = noControl; }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getNoControl( ){ return noControl; }

    public String getNombre( ){ return nombre; }

    public float getPromedio( ){ return promedio; }

}

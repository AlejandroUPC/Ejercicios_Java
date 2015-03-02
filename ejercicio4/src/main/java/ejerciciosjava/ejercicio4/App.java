package ejerciciosjava.ejercicio4;
import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Clase escritura = new Clase(2, 7.5, 'a');
    	escritura.escribir();
    	
    	Clase lectura = new Clase();
    	lectura.leer();
    }
}

package ejerciciosjava.ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Hello world!
 *
 */
public class Cliente 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader LecturaSocket = null;
    	/*if(args.length != 2)
    	{
    		System.out.println("Faltan parámetros");
    	}
    	String direccion = args[0];*/
    	String direccion = "localhost";
    	/*int puerto = Integer.parseInt(args[1]);*/
    	int puerto = 12345;
    	Socket socket = new Socket(direccion,puerto);
    	try
    	{
    		LecturaSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    	}catch (SocketTimeoutException e)
    	{
    		System.out.println("Error en el Socket");
    	}
    	String tiempo = LecturaSocket.readLine();
    	System.out.println(""+tiempo);
    }
}

package ejerciciosjava.ejercicio7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Servidor {
    public static void main( String[] args ) throws IOException
    {
    	SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
    	ServerSocket socketServidor = new ServerSocket(12345);
    	while(true)
    	{
    		Socket socketA = socketServidor.accept();
    		PrintWriter escribir = new PrintWriter(socketA.getOutputStream());
    		escribir.println(fecha.format(System.currentTimeMillis()));
    		escribir.flush();
    	}
    }

}

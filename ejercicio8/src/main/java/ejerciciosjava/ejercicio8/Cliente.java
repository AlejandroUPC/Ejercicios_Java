package ejerciciosjava.ejercicio8;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * Hello world!
 *
 */
public class Cliente 
{
    public static void main( String[] args ) throws IOException
    {
    	String servidor = "localhost";
    	int puerto = 12345;
    	byte[] data = new byte[0];//mando el primer datagrama vacio
    	DatagramPacket UDP = new DatagramPacket(data, data.length, InetAddress.getByName(servidor),puerto);
    	DatagramSocket SocketUDP = new DatagramSocket();
    	SocketUDP.send(UDP);
    	
    	byte[] respuesta = new byte[1496];
    	UDP = new DatagramPacket(respuesta, respuesta.length);
    	SocketUDP.receive(UDP);
    	DataInputStream LecturaSocket = new DataInputStream(new ByteArrayInputStream(UDP.getData()));
    	String hora = LecturaSocket.readUTF();
    	System.out.println(""+hora);
    	
    }
}

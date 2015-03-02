package ejerciciosjava.ejercicio8;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;

public class Servidor {
	

    public static void main(String[] args) throws IOException {

    	int port = 12345;
    	SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	DatagramSocket SocketUDP = new DatagramSocket(port);
    	while(true)
    	{
    		byte[] buffer = new byte[0];
    		DatagramPacket PaqueteUDP = new DatagramPacket(buffer, buffer.length);
    		SocketUDP.receive(PaqueteUDP);
    		
    		ByteArrayOutputStream abc = new ByteArrayOutputStream();//que hace esto?
    		DataOutputStream def = new DataOutputStream(abc);
    		def.writeUTF(fecha.format(System.currentTimeMillis()));
    		byte [] data = abc.toByteArray();
    		PaqueteUDP = new DatagramPacket(data, data.length, PaqueteUDP.getAddress(),PaqueteUDP.getPort());
            SocketUDP.send(PaqueteUDP);
    	}
    }
}

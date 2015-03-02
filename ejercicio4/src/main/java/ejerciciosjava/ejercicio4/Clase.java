package ejerciciosjava.ejercicio4;
import java.io.*;

public class Clase {
	int entero;
	double decimal;
	char caracter;
	public Clase()
	{}
	public void set_entero(int d)
	{
		this.entero=d;
	}
	public void set_decimal(double e)
	{
		this.decimal=e;
	}
	public void set_caracter(char f)
	{
		this.caracter = f;
	}
	public int get_entero()
	{
		return this.entero;
	}
	public double get_decimal()
	{
		return this.decimal;
	}
	public char get_caracter()
	{
		return this.caracter;
	}


	public Clase(int g, double h, char i) {
		this.entero=g;
		this.decimal=h;
		this.caracter=i;
	}
	public void escribir() throws IOException
	{
        DataOutputStream salida = new DataOutputStream(new FileOutputStream("Salida.txt"));
        salida.writeInt(entero);
        salida.writeDouble(decimal);
        salida.writeChar(caracter);
        salida.close();
		
	}
	public Clase leer() throws IOException
	{
		DataInputStream entrada = new DataInputStream(new FileInputStream("Salida.txt"));
		int entero = entrada.readInt();
		double decimal = entrada.readDouble();
		char caracter = entrada.readChar();
		System.out.println(" " + entero + " - " + decimal + " - " + caracter);
		return new Clase(entero,decimal,caracter);
	}

}

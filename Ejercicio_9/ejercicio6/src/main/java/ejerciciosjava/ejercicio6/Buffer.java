package ejerciciosjava.ejercicio6;

public class Buffer {
	char[] vector = new char[32];
	public char metodo1(char[] a)
	{
		char[] rec = a;
		int posicion=0;
		for(int i=0;i<32;i++)
		{
			if (rec[i] == ' ')
			{
				posicion=i;
				i=32;
			}
			i++;
		}
		return 'a';
	}
}

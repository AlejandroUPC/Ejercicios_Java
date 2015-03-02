package ejerciciosjava.ejercicio1;
import org.apache.log4j.Logger;

public class App {
	public static void main(String args[]) {
		Tree[] arboles = new Tree[4];
		arboles[0] = new Tree(4);
		arboles[1] = new Tree("Roble");
		arboles[2] = new Tree();
		arboles[3] = new Tree(5,"Pino");
		//arboles[4] = new Tree(20, "Bonzai");
		int i = 0;
		while(i < arboles.length)
		{
			arboles[i].escribir();
			//System.out.println("Elemento" + i);
			i++;
			
		}
	}
}
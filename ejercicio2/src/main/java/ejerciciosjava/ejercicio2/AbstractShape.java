package ejerciciosjava.ejercicio2;

public abstract class AbstractShape implements Shape {
	String type;
	public AbstractShape(String a) //nombre = que el nombre de la clase abstracta
	{
		this.type=a;
	}
	@Override
	public String toString(){
		return "I'm a " +type;
	}
}

package ejerciciosjava.ejercicio2;

public class Rectangle extends AbstractShape {
	double a,b;
	
	public Rectangle (double d, double e)
	{		
		super("Rectangle");
		this.a=d;
		this.b=e;
	}
	
	public void set_param(double d, double e)
	{
		this.a=d;
		this.b=e;
	}
	
	public double area()
	{
		return a*b;
	}

}

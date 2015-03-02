package ejerciciosjava.ejercicio2;

public class Circle extends AbstractShape{

	double radius;
	
	public Circle (double r)
	{
		super("circle");
		this.radius = r;
	}
	
	public void set_radius(double r)
	{
		this.radius = r;
	}
	public double get_radius()
	{
		return this.radius;
	}
	public double area()
	{
		return this.radius*this.radius*Math.PI;
	}


	
}

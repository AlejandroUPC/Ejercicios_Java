package ejerciciosjava.ejercicio32;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
		double b = Calculo.calc();
	} catch (NumeroGrandeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileParsingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}

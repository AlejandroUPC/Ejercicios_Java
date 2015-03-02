package ejerciciosjava.ejercicio3;
import java.io.FileReader;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
    	/*if (args.length != 1) {
            System.err.println("Program needs the path to the file with the numbers");
            System.exit(-1);
        }*/

        try {
            double average = AverageFileCalculator.average();
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }
    }
}

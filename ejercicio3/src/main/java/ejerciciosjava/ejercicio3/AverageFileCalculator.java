package ejerciciosjava.ejercicio3;
import java.io.BufferedReader; //leer buffers de data
import java.io.FileReader;//leer archivo
import java.io.IOException;//excepciones generals
//excepcion de archivo no encontrado

public class AverageFileCalculator {
    public final static double average() throws FileParsingException, BigNumberException {
    	//funcion cabecera rara, importante hacer el throw de las exceptions
    	double media,sumador = 0;
    	int contador = 0;
    	BufferedReader reader = null; //declaro una variable para leer archivo
    	try
    	{
    		reader = new BufferedReader(new FileReader("Test.txt")); //Leer un buff que leo del archivo "file" que le paso a la funcion
    		String line = null;//Linea por linea de lectura
    		while(reader.readLine() != null)//voy leyendo
    		{
    			try{
    			int number = Integer.parseInt(line);//Convertir String en Int
    			System.out.println(""+number);
    			if (number > 1000) //si el numero es más grande que mil, throw exception
    			{
    				throw new BigNumberException("Number greater than 1000 in the position " +contador+1);//masterclass excepciones
    			}
    			sumador=sumador+number;
    			contador++;
    			}
    			catch(NumberFormatException e)
    			{
    				throw new FileParsingException(e.getMessage()); //master class excepctiones; reqisito 1
    			}
    		}
    	   } catch (java.io.IOException e) {
               throw new FileParsingException(e.getMessage()); //master class; reqisito 1 
           }
    	
    	finally{
    	try{
    		reader.close();
    		
    	}
    	catch(IOException e){
    		System.err.println("Warning: can not close file"); //reqisito 3	
    	}
    	}
        return 0.0;

    }

}

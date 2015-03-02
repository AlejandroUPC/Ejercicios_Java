package ejerciciosjava.ejercicio32;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;


public class Calculo {
	public static double calc() throws NumeroGrandeException, FileParsingException{
		double num;
		int cont = 0;
		BufferedReader a = null;
		String linea = null;
		try{
			a = new BufferedReader(new FileReader("Test.txt"));
			linea = a.readLine();
			while(linea != null)
			{
				try{
				num = Integer.parseInt(linea);
				cont++;
				System.out.println("Número " +num+ " posición " +cont);
					if (num > 1000)
					{
						throw new NumeroGrandeException("El número" +num+ "en la posición " +cont+ " es demasiado grande\n");
					}
				}
				catch(NumberFormatException e)
				{
						throw new FileParsingException(e.getMessage());
					
				}
				/*catch (java.io.IOException e) 
				{
		               throw new FileParsingException(e.getMessage()); 
		           }
		           */
				linea = a.readLine();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		finally{
			try{
				
				a.close();
				}
		catch(IOException e){
	    		System.err.println("Warning: can not close file"); //reqisito 3	
	    	}
		}
		return 0;
		}
	}



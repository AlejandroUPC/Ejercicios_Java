package ejerciciosjava.ejercicio5;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ThreadClass threadClass = new ThreadClass("Thread creado por ThreadClass");
        Thread thread = new Thread(new RunnableClass(), "Thread creado por RunnableClass");
        threadClass.start();
        thread.start();   
        threadClass.join();
        thread.join();
        
        System.out.println("Se acabó");
    }
}

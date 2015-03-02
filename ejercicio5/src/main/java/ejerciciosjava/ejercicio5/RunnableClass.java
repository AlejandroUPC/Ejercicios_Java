package ejerciciosjava.ejercicio5;

public class RunnableClass implements Runnable{//si utilizamos runable hay que crear el metodo run(); ES IMPLEMENT
	long lastExecution = 0;
	int counter = 0;
	
	public void run()
	{
		for(int i=0 ; i < 10 ; i++)
		{
			long currentExecution = System.currentTimeMillis();
            long elapsed = (lastExecution == 0) ? 0 : currentExecution - lastExecution;// como funcionan
            lastExecution = currentExecution;
            System.out.println(Thread.currentThread().getName() + " elapsed " + elapsed + " ms " + counter);
            counter ++;
            long sleep = (long) (Math.random() * 2000);
            try{
            	Thread.sleep(sleep);
            }catch(InterruptedException e)
            {
            	e.printStackTrace();
            }
		}
	}
}

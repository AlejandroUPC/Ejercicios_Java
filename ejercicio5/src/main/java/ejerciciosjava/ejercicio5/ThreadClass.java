package ejerciciosjava.ejercicio5;

public class ThreadClass extends Thread { //es EXTEND, como es extend hay que hacer el SUPER
	long lastExecution=0;
	int counter = 0;
	
	public ThreadClass(String a){
		
		super(a);
	}
    public void run() {
        for (int i = 0; i < 10; i++) {
            long currentExecution = System.currentTimeMillis();
            long elapsed = (lastExecution == 0) ? 0 : currentExecution - lastExecution;
            lastExecution = currentExecution;
            System.out.println(getName() + " elapsed = " + elapsed + " ms. " + counter);
            counter++;
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

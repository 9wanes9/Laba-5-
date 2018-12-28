package threads;

public class Thread01 {
    public void run(){
        try {
            while(true){
                if (!isInterrupted()) {
                    Lg.logger("Thread01");
                } else {
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("stopped Thread01");
        }
}
}

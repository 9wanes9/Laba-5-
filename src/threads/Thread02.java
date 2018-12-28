package threads;

public class Thread02 {
    public void run(){
        try {
            while(true){
                if (!isInterrupted()) {
                    Lg.logger("Thread02");
                } else {
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("stopped Thread02");
        }
}
}

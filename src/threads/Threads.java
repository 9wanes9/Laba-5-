
package threads;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Threads {

    public static void main(String[] args) {
        final Thread01 td01 = new Thread01();
        final Thread02 td02 = new Thread02();
        td01.run();
        td02.run();
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Прерывание потоков...");
                td01.interrupt();
                td02.interrupt();
            }
        });
        timer.setRepeats(false);
timer.start();
    }
    
}

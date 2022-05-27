import java.util.Timer;
import java.util.TimerTask;

public class TesteTimer {
    public static void main(String[] args) {

        int delay = 5000;   // delay de 5 seg.
        int interval = 1000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        timer.ScheduledExecutorService(new TimerTask() {
            public void run() {
                // colocar tarefas aqui ...
                System.out.println("Olá mundo!!");
                System.out.println("ABEC");
                System.out.println("HDAUIS");
                System.out.println("DNA");
                System.out.println("DIOA");
                System.out.println("JDA98");
            }
        }, delay, interval);
    }
}

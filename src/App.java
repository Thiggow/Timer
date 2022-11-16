import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {

        int x = 1;
        Timer cronom = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run(){
                System.out.println(x);
            }
        };

        int ms = 1000;
        int milis = 0;
        cronom.schedule(task, milis, ms);

    }
}

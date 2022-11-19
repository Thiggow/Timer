import java.util.TimerTask;

public class App {
    public static void main(String[] args) {

        Cronometro timer = new Cronometro();
        TimerTask cancelTask = new TimerTask(){
            
            @Override
            public void run() {

                System.out.println("The timer was on for a whole day. Then it was turned off.");
            }
        };
        TimerTask task = new TimerTask(){

            @Override
            public void run(){

                System.out.println("" + timer.x2 + timer.x + ":" + timer.y2 + timer.y + ":" + 
                timer.z2 + timer.z);

                timer.showIt();

                if(timer.x2 == 2 && timer.x == 4 && timer.y2 == 0 && timer.y == 0 && 
                timer.z2 == 0 && timer.z == 0){

                    timer.cronom.schedule(cancelTask, 1000);
                    cancel();
                }

            }
        };

        timer.cronom.schedule(task, 0, 1000);

    }
}

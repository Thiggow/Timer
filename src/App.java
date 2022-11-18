import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {

        Timer cronom = new Timer();
        TimerTask cancelTask = new TimerTask(){
            
            @Override
            public void run() {
                System.out.println("The timer was on for a whole day. Then it was turned off.");
                
            }
        };
        TimerTask task = new TimerTask(){
            int x = 3, x2 = 2;
            int y = 9, y2 = 5;
            int z = 5, z2 = 5;

            @Override
            public void run(){
                System.out.println("" + x2 + x + ":" + y2 + y + ":" + z2 + z);
                
                if(z == 9){

                    if(z2 == 5 && z == 9){

                        if(y == 9 && z2 == 5 && z == 9){

                            if(y2 == 5 && y == 9 && z2 == 5 && z == 9){

                                if(x == 9 && y2 == 5 && y == 9 && z2 == 5 && z == 9){
                                    z = 0;
                                    z2 = 0;
                                    y = 0;
                                    y2 = 0;
                                    x = 0;
                                    x2 += 1;
                                }else{
                                    z = 0;
                                    z2 = 0;
                                    y = 0;
                                    y2 = 0;
                                    x += 1;
                                }

                            }else{
                                z = 0;
                                z2 = 0;
                                y = 0;
                                y2 += 1;
                            }

                        }else{
                            y += 1;
                            z = 0;
                            z2 = 0;
                        }
                        
                    }else{
                        z = 0;
                        z2 += 1;
                    }
                }
                else{
                    z += 1;
                }


                if(x2 == 2 && x == 4 && y2 == 0 && y == 0 && z2 == 0 && z == 0){
                    cronom.schedule(cancelTask, 1000);
                    cancel();
                    cronom.purge();
                }
            }
        };

        int ms = 1000;
        int milis = 0;
        cronom.schedule(task, milis, ms);

    }
}

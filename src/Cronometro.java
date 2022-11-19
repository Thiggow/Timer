import java.util.Timer;

public class Cronometro {
    
    int x = 0, x2 = 0;
    int y = 0, y2 = 0;
    int z = 0, z2 = 0;

    Timer cronom = new Timer();

    public void showIt(){

        if(z == 9){

            minuteOne();
        }

        else{
            z += 1;
        }
    }
    
    
    public void minuteOne(){
        if(z2 == 5 && z == 9){

            minuteTwo();
        }

        else{
            
            z = 0;
            z2 += 1;
        }
    }


    public void minuteTwo(){

        if(y == 9 && z2 == 5 && z == 9){

            hourOne();
        }

        else{

            z = 0;
            z2 = 0;
            y += 1;
        }
    }


    public void hourOne(){

        if(y2 == 5 && y == 9 && z2 == 5 && z == 9){

            hourTwo();
        }

        else{

            z = 0;
            z2 = 0;
            y = 0;
            y2 += 1;
        }
    }


    public void hourTwo(){

        if(x == 9 && y2 == 5 && y == 9 && z2 == 5 && z == 9){

            z = 0;
            z2 = 0;
            y = 0;
            y2 = 0;
            x = 0;
            x2 += 1;
        }

        else{

            z = 0;
            z2 = 0;
            y = 0;
            y2 = 0;
            x += 1;
        }
    }

}

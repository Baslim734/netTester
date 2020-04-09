package netTesterMain;
import java.util.concurrent.TimeUnit;

public class main {
public static void main(String[] args){
    int countHours = 0;
	tryNet trynet2 = new tryNet();
    if (countHours != 300) {
        trynet2.justtry();
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        countHours++;
    }
    else {
        System.out.println("Ya vse blet");
        return;
    }

    }
}

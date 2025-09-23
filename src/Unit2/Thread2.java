package Unit2;
import java.util.*;
public class Thread2 extends Thread{
    public void run() {
        for(int i=0;i<10;i++) {
            try{
                Thread.sleep(2500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}

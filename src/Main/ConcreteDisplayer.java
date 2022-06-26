package Main;

import java.time.LocalDateTime;


public class ConcreteDisplayer implements Displayer {


    @Override
    public String display() {
        return "HOUR : "+ LocalDateTime.now().getHour()+" MIN: "+LocalDateTime.now().getMinute();
    }

    @Override
    public double price() {
        return 200;
    }


    @Override
    public void update(Object data) {

    }

}

package Main;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WeatherService extends Service implements Runnable{

    private float temp=30;
    private static WeatherService weatherService;
    private WeatherService() {
        thread = new Thread(this::run);
        thread.start();
    }

    @Override
    public void run() {

        while (true){

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(new Random().nextBoolean()){
                temp += new Random().nextFloat(-1,1);
                setData("Temp : "+temp);
            }

        }

    }


    public static WeatherService getInstance(){

        if(weatherService!=null)
            return weatherService;
        weatherService = new WeatherService();
        return weatherService;

    }

}

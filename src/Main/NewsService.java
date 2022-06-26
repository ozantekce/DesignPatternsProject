package Main;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NewsService extends Service implements Runnable{

    private static String news[] = {"economy collapsed","alien attack","it snowed in the desert","Elections in Papua New Guinea"};
    private String last="";
    private static NewsService weatherService;
    private NewsService() {
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

            String n = news[(int)(Math.random()*4)];

            if(n!=last){
                last = n;
                setData("Breaking News : "+n);
            }

        }

    }


    public static NewsService getInstance(){

        if(weatherService!=null)
            return weatherService;
        weatherService = new NewsService();
        return weatherService;

    }




}

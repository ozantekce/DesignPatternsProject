package Main;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DateService extends Service implements Runnable{


    private static String last="";
    private static DateService dateService;
    private DateService() {
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
            String date = java.time.LocalDate.now().toString();
            if(date!=last){
                last = date;
                setData("Date : "+date);
            }

        }

    }


    public static DateService getInstance(){

        if(dateService!=null)
            return dateService;
        dateService = new DateService();
        return dateService;

    }

}

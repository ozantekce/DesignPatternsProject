package Main;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExchangeRateService extends Service implements Runnable{

    private double dolar = 5;
    private double euro  = 5;
    private static ExchangeRateService exchangeRateService;

    private ExchangeRateService() {
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
                dolar += new Random().nextDouble(-1,1);
                euro += new Random().nextDouble(-1,1);

                setData("Dolar : "+dolar+" Euro :"+euro);

            }

        }

    }


    public static ExchangeRateService getInstance(){

        if(exchangeRateService!=null)
            return exchangeRateService;
        exchangeRateService = new ExchangeRateService();
        return exchangeRateService;

    }

}

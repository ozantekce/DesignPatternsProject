package Main;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("create new watch : 1 , exit : 0");
            int s = scan.nextInt();
            if(s==0)
                break;
            else if(s!=1)
                continue;
            System.out.println("name of watch :");
            String name = scan.next();
            Displayer displayer = new ConcreteDisplayer();
            Watch watch = new Watch(name,displayer);
            Scanner scan2 = new Scanner(System.in);

            boolean booleans [] = new boolean[4];

            while (true){

                System.out.println(" add date displayer  : 1 , add exchange rate displayer  : 2 " +
                        ", add news displayer  : 3 , add weather displayer  : 4 , exit : 0");
                int s2 = scan2.nextInt();
                if(s2==0)
                    break;
                else if(s2==1 && !booleans[0]){
                    displayer = new DateDisplayer(displayer);
                    watch.setDisplayer(displayer);
                    booleans[0] = !booleans[0];
                }
                else if(s2==2 && !booleans[1]) {
                    displayer = new ExchangeRateDisplayer(displayer);
                    watch.setDisplayer(displayer);
                    booleans[1] = !booleans[1];
                }
                else if(s2==3 && !booleans[2]) {
                    displayer = new NewsDisplayer(displayer);
                    watch.setDisplayer(displayer);
                    booleans[2] = !booleans[2];
                }
                else if(s2==4 && !booleans[3]) {
                    displayer = new WeatherDisplayer(displayer);
                    watch.setDisplayer(displayer);
                    booleans[3] = !booleans[3];
                }
            }

            System.out.println("price of :"+watch.getName()+" "+watch.price());


        }


    }



}

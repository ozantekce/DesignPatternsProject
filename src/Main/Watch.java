package Main;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Watch implements Runnable{

    private Displayer displayer;
    private Thread thread;
    private String name;

    private JLabel label;

    public Watch(String name,Displayer displayer) {
        this.displayer = displayer;
        thread = new Thread(this);
        thread.start();
        this.name =name;

        JFrame frame = new JFrame(name);
        JPanel panel = new JPanel();
        frame.add(panel);
        label = new JLabel();
        panel.add(label);
        frame.pack();
        frame.setBounds(0,0,400,300);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }


    @Override
    public void run() {
        while (true){
            try {TimeUnit.SECONDS.sleep(4);}
            catch (InterruptedException e){e.printStackTrace();}
            //System.out.println("---------"+name+"----------"+"\n"+displayer.display()+"\n------------------------");
            String text = "---------"+name+"----------"+"\n"+displayer.display()+"\n------------------------";
            text+= "\n price :"+price();
            text = text.replaceAll("\n","<br/>");
            text = "<html>" +text+"</html>";
            label.setText(text);

        }

    }

    public double price(){
        return displayer.price();
    }

    public void setDisplayer(Displayer displayer) {
        this.displayer = displayer;
    }

    public Displayer getDisplayer() {
        return displayer;
    }


    public String getName() {
        return name;
    }
}

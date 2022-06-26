package Main;

public class WeatherDisplayer extends BaseDecorator{

    private Service service = WeatherService.getInstance();
    private String display;

    public WeatherDisplayer(Displayer displayer) {
        super(displayer);
        service.registerObserver(this);
    }

    @Override
    public String display() {
        return getDisplayer().display()+"\n"+display;
    }

    @Override
    public double price() {
        return getDisplayer().price()+40;
    }

    @Override
    public void update(Object data) {
        display = (String) data;
    }



}

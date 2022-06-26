package Main;

public class ExchangeRateDisplayer extends BaseDecorator{

    private Service service = ExchangeRateService.getInstance();
    private String display;

    public ExchangeRateDisplayer(Displayer displayer) {
        super(displayer);
        service.registerObserver(this);
    }

    @Override
    public String display() {
        return getDisplayer().display()+"\n"+display;
    }

    @Override
    public double price() {
        return getDisplayer().price()+100;
    }

    @Override
    public void update(Object data) {
        display = (String) data;
    }

}
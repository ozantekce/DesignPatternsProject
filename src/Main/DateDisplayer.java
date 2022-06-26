package Main;

public class DateDisplayer extends BaseDecorator{

    private Service service = DateService.getInstance();
    private String display;

    public DateDisplayer(Displayer displayer) {
        super(displayer);
        service.registerObserver(this);
    }

    @Override
    public String display() {
        return getDisplayer().display()+"\n"+display;
    }

    @Override
    public double price() {
        return getDisplayer().price()+5;
    }

    @Override
    public void update(Object data) {
        display = (String) data;
    }



}

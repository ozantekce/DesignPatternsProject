package Main;

public class NewsDisplayer extends BaseDecorator{

    private Service service = NewsService.getInstance();
    private String display;

    public NewsDisplayer(Displayer displayer) {
        super(displayer);
        service.registerObserver(this);
    }

    @Override
    public String display() {
        return getDisplayer().display()+"\n"+display;
    }

    @Override
    public double price() {
        return getDisplayer().price()+60;
    }

    @Override
    public void update(Object data) {
        display = (String) data;
    }



}

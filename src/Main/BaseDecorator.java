package Main;

public abstract class BaseDecorator implements Displayer{

    private Displayer displayer;

    public BaseDecorator(Displayer displayer) {
        this.displayer = displayer;
    }

    public Displayer getDisplayer() {
        return displayer;
    }

}

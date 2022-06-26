package Main;

import java.util.ArrayList;

public abstract class Service implements Subject {

    private ArrayList<Observer> list;
    private Object data;
    protected Thread thread;

    public Service() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!list.contains(observer))
            list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(list.contains(observer))
            list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:list) {
            observer.update(data);
        }
    }

    public void setData(Object data) {
        this.data = data;
        notifyObservers();
    }


}

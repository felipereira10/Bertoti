package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }
}
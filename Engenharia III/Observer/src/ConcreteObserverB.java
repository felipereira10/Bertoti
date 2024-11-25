package observer;

public class ConcreteObserverB implements Observer {

    public void update(Observable o) {
        ObservableData data = (ObservableData) o;
        System.out.println("ConcreteObserverB recebeu os dados: " + data.getData());
    }
}
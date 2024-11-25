package observer;

public class ConcreteObserverA implements Observer {

    public void update(Observable o) {
        ObservableData data = (ObservableData) o;
        System.out.println("ConcreteObserverA recebeu os dados: " + data.getData());
    }
}
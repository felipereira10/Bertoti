package observer;

public class SubjectData extends Subject {
    private Object myData;

    public void setData(Object myData) {
        this.myData = myData;
        notifyObservers();
    }

    public Object getData() {
        return myData;
    }
}
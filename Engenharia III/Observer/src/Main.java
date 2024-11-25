package observer;

public class Main {
    public static void main(String[] args) {
    	
        SubjectData subjectData = new SubjectData();

        // Criar observers
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        subjectData.add(observerA);
        subjectData.add(observerB);

        subjectData.setData("Dado atualizado 1");
        subjectData.setData("Dado atualizado 2");
    }
}
package animalstrategy;

public class Leopardo extends Felino {
    public Leopardo(CorrerStrategy correrStrategy, PularStrategy pularStrategy) {
        super(correrStrategy, pularStrategy);
    }

    @Override
    public void display() {
        System.out.println("Sou um leopardo.");
    }
}


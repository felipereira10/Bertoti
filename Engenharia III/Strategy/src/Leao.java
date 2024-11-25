package animalstrategy;

public class Leao extends Felino {
    public Leao(CorrerStrategy correrStrategy, PularStrategy pularStrategy) {
        super(correrStrategy, pularStrategy);
    }

    @Override
    public void display() {
        System.out.println("Sou um leão.");
    }
}


package animalstrategy;

public class TigreToy extends Felino {
    public TigreToy(CorrerStrategy correrStrategy, PularStrategy pularStrategy) {
        super(correrStrategy, pularStrategy);
    }

    @Override
    public void display() {
        System.out.println("Sou um tigre de brinquedo.");
    }
}


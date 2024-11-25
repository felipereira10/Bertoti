package animalstrategy;

public abstract class Felino {
    private CorrerStrategy correrStrategy;
    private PularStrategy pularStrategy;

    public Felino(CorrerStrategy correrStrategy, PularStrategy pularStrategy) {
        this.correrStrategy = correrStrategy;
        this.pularStrategy = pularStrategy;
    }

    public abstract void display();

    public void rugir() {
        System.out.println("Rugindo...");
    }

    public void performarCorrer() {
        if (correrStrategy != null) correrStrategy.correr();
    }

    public void performarPular() {
        if (pularStrategy != null) pularStrategy.pular();
    }

    public void setCorrerStrategy(CorrerStrategy correrStrategy) {
        this.correrStrategy = correrStrategy;
    }

    public void setPularStrategy(PularStrategy pularStrategy) {
        this.pularStrategy = pularStrategy;
    }
}

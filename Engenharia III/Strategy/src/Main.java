package animalstrategy;

public class Main {
    public static void main(String[] args) {
        Felino leao = new Leao(new CorrerCurtaDist(), new PularAlto());
        leao.display();
        leao.rugir();
        leao.performarCorrer();
        leao.performarPular();

        Felino leopardo = new Leopardo(new CorrerLongaDist(), new PularAlto());
        leopardo.display();
        leopardo.performarCorrer();

        Felino tigreToy = new TigreToy(new CorrerToy(), new PularToy());
        tigreToy.display();
        tigreToy.performarCorrer();
        tigreToy.performarPular();
    }
}

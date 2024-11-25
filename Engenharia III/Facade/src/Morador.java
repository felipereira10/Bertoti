package Composite;

public class Morador extends Component {
    public Morador(String nome) {
        super(nome);
    }

    @Override
    public void exibir() {
        System.out.println("Morador: " + nome);
    }
}

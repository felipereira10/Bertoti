package Composite;

import java.util.ArrayList;
import java.util.List;

public class Apartamento extends Component {
    private List<Component> itens;

    public Apartamento(String nome) {
        super(nome);
        this.itens = new ArrayList<>();
    }

    @Override
    public void adicionar(Component componente) {
        itens.add(componente);
    }

    @Override
    public void remover(Component componente) {
        itens.remove(componente);
    }

    @Override
    public void exibir() {
        System.out.println("  Apartamento: " + nome);
        for (Component item : itens) {
            item.exibir();
        }
    }
}
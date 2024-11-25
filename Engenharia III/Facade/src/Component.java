package Composite;

import java.util.ArrayList;
import java.util.List;

abstract class Component {
    protected String nome;

    public Component(String nome) {
        this.nome = nome;
    }

    public abstract void exibir();
    public void adicionar(Component componente) {
        throw new UnsupportedOperationException("Operação não suportada.");
    }
    public void remover(Component componente) {
        throw new UnsupportedOperationException("Operação não suportada.");
    }
}
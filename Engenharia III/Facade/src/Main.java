package Composite;

public class Main {
    public static void main(String[] args) {
        // Criação de moradores
        Component morador1 = new Morador("João");
        Component morador2 = new Morador("Maria");
        Component morador3 = new Morador("Carlos");

        // Criação de apartamentos
        Component apartamento1 = new Apartamento("101");
        Component apartamento2 = new Apartamento("102");

        // Adicionando moradores aos apartamentos
        apartamento1.adicionar(morador1);
        apartamento2.adicionar(morador2);
        apartamento2.adicionar(morador3);

        // Criação do edifício
        Component edificio = new Edificio("Residencial Sol");

        // Adicionando apartamentos ao edifício
        edificio.adicionar(apartamento1);
        edificio.adicionar(apartamento2);

        // Exibição da estrutura
        edificio.exibir();
    }
}
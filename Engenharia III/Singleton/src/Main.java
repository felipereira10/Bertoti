package singleton;

public class Main {
    public static void main(String[] args) {
        // Primeiro acesso ao Singleton (cria a instância)
        Singleton objeto1 = Singleton.getInstance();

        // Segundo acesso ao Singleton (reutiliza a mesma instância)
        Singleton objeto2 = Singleton.getInstance();

        // Verifica se as referências apontam para a mesma instância
        if (objeto1 == objeto2) {
            System.out.println("objeto1 e objeto2 são a mesma instância.");
        }
    }
}
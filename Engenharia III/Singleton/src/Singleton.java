package singleton;

public class Singleton {
    // Instância única da classe
    private static Singleton instancia;

    // Construtor privado para impedir a criação direta
    private Singleton() {
        System.out.println("Instância do Singleton criada!");
    }

    // Método estático para obter a única instância da classe
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
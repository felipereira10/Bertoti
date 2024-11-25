public class Facade {
    private ItauService itauService;
    private CrefisaService crefisaService;
    private BMGService bmgService;

    public Facade() {
        this.itauService = new ItauService();
        this.crefisaService = new CrefisaService();
        this.bmgService = new BMGService();
    }

    public void buscarCredito() {
        System.out.println("Buscando crédito através de diferentes serviços...");
        itauService.getEmprestimo();
        crefisaService.getEmprestimo();
        bmgService.getEmprestimo();
    }
}
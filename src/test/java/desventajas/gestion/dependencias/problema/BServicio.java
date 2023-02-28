package desventajas.gestion.dependencias.problema;

public class BServicio {

    private ARepository aRepository;

    public BServicio() {
        this.aRepository = new XDataBaseRepository();
    }

    public String ejecutar() {
        return aRepository.getData();
    }

}

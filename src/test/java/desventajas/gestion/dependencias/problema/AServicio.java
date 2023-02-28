package desventajas.gestion.dependencias.problema;

public class AServicio {

    private ARepository aRepository;

    public AServicio() {
        this.aRepository = new XDataBaseRepository();
    }

    public String ejecutar() {
        return aRepository.getData();
    }


    public ObjectA getObjectById(String s) {
        return aRepository.findById(s);
    }

}

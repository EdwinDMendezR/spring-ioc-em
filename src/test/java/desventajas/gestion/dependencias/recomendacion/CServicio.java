package desventajas.gestion.dependencias.recomendacion;

import desventajas.gestion.dependencias.problema.ARepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CServicio {

    @Autowired
    private ARepository aRepository;

    public String ejecutar() {
        return aRepository.getData();
    }

}

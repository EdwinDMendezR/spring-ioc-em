package desventajas.gestion.dependencias.recomendacion;

import desventajas.gestion.dependencias.problema.ARepository;
import desventajas.gestion.dependencias.problema.XDataBaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ARepository getArepository() {
        //return new ZDataBaseRepository();
        return new XDataBaseRepository();
    }

}

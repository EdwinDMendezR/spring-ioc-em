package desventajas.realizacion.pruebas.recomendacion;

import desventajas.gestion.dependencias.problema.ARepository;
import desventajas.gestion.dependencias.recomendacion.BeansConfig;
import desventajas.gestion.dependencias.recomendacion.CServicio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BeansConfig.class, CServicio.class})
public class RecomendacionPruebas {

    @Autowired
    private CServicio cServicio;

    @Autowired
    private ARepository aRepository;

    @Test
    public void recomendacion() {
        cServicio.ejecutar();
    }

}

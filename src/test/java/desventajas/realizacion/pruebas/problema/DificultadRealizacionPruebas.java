package desventajas.realizacion.pruebas.problema;

import desventajas.gestion.dependencias.problema.ARepository;
import desventajas.gestion.dependencias.problema.AServicio;
import desventajas.gestion.dependencias.problema.ObjectA;
import desventajas.gestion.dependencias.problema.XDataBaseRepository;
import org.junit.Assert;
import org.junit.Test;

public class DificultadRealizacionPruebas {

    @Test
    public void problema() {
        AServicio aServicio = new AServicio();
        ARepository aRepository = new XDataBaseRepository();
        ObjectA objectA = new ObjectA("1", "objecta");
        aRepository.save(objectA);
        ObjectA resultado = aServicio.getObjectById("1");
        Assert.assertEquals("objecta", resultado.getName());
    }

}

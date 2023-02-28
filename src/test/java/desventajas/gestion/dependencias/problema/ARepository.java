package desventajas.gestion.dependencias.problema;

import java.util.ArrayList;
import java.util.List;


public interface ARepository {
    List<ObjectA> FAKE_DB = new ArrayList<>();
    String getData();
    void save(ObjectA objectA);
    ObjectA findById(String id);
}

package desventajas.gestion.dependencias.problema;

import java.util.ArrayList;
import java.util.List;

public class ZDataBaseRepository implements ARepository {

    private List<ObjectA> dataList = new ArrayList<>();

    @Override
    public String getData() {
        return "ZDataBaseRepository::getData";
    }

    @Override
    public void save(ObjectA objectA) {
        FAKE_DB.add(objectA);
    }

    @Override
    public ObjectA findById(String id) {
        return FAKE_DB.stream()
                .filter(objectA -> objectA.getId().equalsIgnoreCase(id))
                .findFirst().get();
    }


}
